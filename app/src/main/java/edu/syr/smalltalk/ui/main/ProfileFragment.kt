package edu.syr.smalltalk.ui.main

import android.content.Context
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.preference.PreferenceManager
import edu.syr.smalltalk.R
import edu.syr.smalltalk.service.ISmallTalkServiceProvider
import edu.syr.smalltalk.service.KVPConstant
import edu.syr.smalltalk.service.model.logic.SmallTalkApplication
import edu.syr.smalltalk.service.model.logic.SmallTalkViewModel
import edu.syr.smalltalk.service.model.logic.SmallTalkViewModelFactory
import kotlinx.android.synthetic.main.layout_contact_detail.*

class ProfileFragment : Fragment() {
    private val viewModel: SmallTalkViewModel by viewModels {
        SmallTalkViewModelFactory(requireContext().applicationContext as SmallTalkApplication)
    }

    private lateinit var serviceProvider: ISmallTalkServiceProvider

    override fun onAttach(context: Context) {
        super.onAttach(context)

        serviceProvider = requireActivity() as ISmallTalkServiceProvider
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout._fragment_about_me, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        contact_enter_chat.visibility = View.GONE
        contact_send_request.visibility = View.GONE

        val userId: Int = PreferenceManager
            .getDefaultSharedPreferences(requireActivity().applicationContext)
            .getInt(KVPConstant.K_CURRENT_USER_ID, 0)

        viewModel.getCurrentUserInfo(userId).observe(viewLifecycleOwner, { user ->
            if (user.isEmpty()) {
                if (serviceProvider.hasService()) {
                    serviceProvider.getService()!!.loadUser()
                }
            } else {
                text_contact_name.text = user[0].userName
                text_contact_email.text = user[0].userEmail
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        inflater.inflate(R.menu.menu_profile, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_view_request -> {
                val action = MainFragmentDirections.profileViewRequest()
                requireView().findNavController().navigate(action)
            }
            R.id.navigation_share_me -> {
                Toast.makeText(requireContext(), "Share Clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.navigation_sign_out -> {
                if (serviceProvider.hasService()) {
                    serviceProvider.getService()!!.userSessionSignOut()
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
