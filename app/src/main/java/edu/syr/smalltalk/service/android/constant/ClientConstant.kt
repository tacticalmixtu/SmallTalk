package edu.syr.smalltalk.service.android.constant

object ClientConstant {
    const val API_USER_SIGN_UP = "/system/user_sign_up"
    const val API_USER_SIGN_UP_PASSCODE_REQUEST = "/system/user_sign_up_passcode_request"
    const val API_USER_RECOVER_PASSWORD = "/system/user_recover_password"
    const val API_USER_RECOVER_PASSWORD_PASSCODE_REQUEST =
        "/system/user_recover_password_passcode_request"
    const val API_USER_SIGN_IN = "/system/user_sign_in"
    const val API_USER_SESSION_SIGN_IN = "/system/user_session_sign_in"
    const val API_USER_SESSION_SIGN_OUT = "/system/user_session_sign_out"
    const val API_USER_MODIFY_NAME = "/system/user_modify_name"
    const val API_USER_MODIFY_PASSWORD = "/system/user_modify_password"
    const val API_LOAD_USER = "/system/load_user"
    const val API_LOAD_CONTACT = "/system/load_contact"
    const val API_LOAD_GROUP = "/system/load_group"
    const val API_LOAD_REQUEST = "/system/load_request"
    const val API_CHAT_MESSAGE_FORWARD = "/chat/message_forward"
    const val API_CHAT_MESSAGE_FORWARD_GROUP = "/chat/message_forward_group"
    const val API_CHAT_CONTACT_ADD_REQUEST = "/chat/contact_add_request"
    const val API_CHAT_CONTACT_ADD_CONFIRM = "/chat/contact_add_confirm"
    const val API_CHAT_CONTACT_ADD_REFUSE = "/chat/contact_add_refuse"
    const val API_CHAT_GROUP_CREATE_REQUEST = "/chat/group_create_request"
    const val API_CHAT_GROUP_MODIFY_NAME = "/chat/group_modify_name"
    const val API_CHAT_GROUP_ADD_REQUEST = "/chat/group_add_request"
    const val API_CHAT_GROUP_ADD_CONFIRM = "/chat/group_add_confirm"
    const val API_CHAT_GROUP_ADD_REFUSE = "/chat/group_add_refuse"
    const val API_CHAT_WEBRTC_CALL = "/chat/webrtc_call"

    const val TIMESTAMP = "timestamp"
    const val USER_SIGN_UP_USER_EMAIL = "user_email"
    const val USER_SIGN_UP_USER_PASSWORD = "user_password"
    const val USER_SIGN_UP_PASSCODE = "passcode"
    const val USER_SIGN_UP_PASSCODE_REQUEST_USER_EMAIL = "user_email"
    const val USER_RECOVER_PASSWORD_USER_EMAIL = "user_email"
    const val USER_RECOVER_PASSWORD_USER_PASSWORD = "user_password"
    const val USER_RECOVER_PASSWORD_PASSCODE = "passcode"
    const val USER_RECOVER_PASSWORD_PASSCODE_REQUEST_USER_EMAIL = "user_email"
    const val USER_SIGN_IN_USER_EMAIL = "user_email"
    const val USER_SIGN_IN_USER_PASSWORD = "user_password"
    const val USER_SESSION_SIGN_IN_SESSION_TOKEN = "session_token"
    const val USER_MODIFY_USER_NAME_NEW_USER_NAME = "new_user_name"
    const val USER_MODIFY_USER_PASSWORD_NEW_USER_PASSWORD = "new_user_password"
    const val LOAD_CONTACT_CONTACT_ID = "contact_id"
    const val LOAD_GROUP_GROUP_ID = "group_id"
    const val LOAD_REQUEST_REQUEST_ID = "request_id"
    const val CHAT_MESSAGE_FORWARD_SENDER = "sender"
    const val CHAT_MESSAGE_FORWARD_RECEIVER = "receiver"
    const val CHAT_MESSAGE_FORWARD_CONTENT = "content"
    const val CHAT_MESSAGE_FORWARD_CONTENT_TYPE = "content_type"
    const val CHAT_MESSAGE_FORWARD_GROUP_SENDER = "sender"
    const val CHAT_MESSAGE_FORWARD_GROUP_RECEIVER = "receiver"
    const val CHAT_MESSAGE_FORWARD_GROUP_CONTENT = "content"
    const val CHAT_MESSAGE_FORWARD_GROUP_CONTENT_TYPE = "content_type"
    const val CHAT_CONTACT_ADD_REQUEST_CONTACT_EMAIL = "contact_email"
    const val CHAT_CONTACT_ADD_CONFIRM_REQUEST_ID = "request_id"
    const val CHAT_CONTACT_ADD_REFUSE_REQUEST_ID = "request_id"
    const val CHAT_GROUP_CREATE_REQUEST_GROUP_NAME = "group_name"
    const val CHAT_GROUP_MODIFY_NAME_GROUP_ID = "group_id"
    const val CHAT_GROUP_MODIFY_NAME_NEW_GROUP_NAME = "new_group_name"
    const val CHAT_GROUP_ADD_REQUEST_GROUP_ID = "group_id"
    const val CHAT_GROUP_ADD_CONFIRM_REQUEST_ID = "request_id"
    const val CHAT_GROUP_ADD_REFUSE_REQUEST_ID = "request_id"
    const val CHAT_WEBRTC_CALL_SENDER = "sender"
    const val CHAT_WEBRTC_CALL_RECEIVER = "receiver"
    const val CHAT_WEBRTC_CALL_WEBRTC_COMMAND = "webrtc_command"
    const val CHAT_WEBRTC_CALL_WEBRTC_SESSION_DESCRIPTION = "webrtc_description"

    const val CHAT_CONTENT_TYPE_TEXT = "text"
    const val CHAT_CONTENT_TYPE_IMAGE = "image"
    const val CHAT_CONTENT_TYPE_AUDIO = "audio"
    const val CHAT_CONTENT_TYPE_VIDEO = "video"
    const val CHAT_CONTENT_TYPE_FILE = "file"
}