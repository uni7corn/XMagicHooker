package com.magic.wework.apis.com.tencent.wework.msg.temp

class ConversationApiImpl {

    companion object {
        private var instance: ConversationApiImpl? = null

        @Synchronized
        fun newInstance(): ConversationApiImpl {
            if (instance == null) {
                instance = ConversationApiImpl()
            }
            return instance!!
        }

        /**
         * @param remoteId
         * @return com.tencent.wework.foundation.model.User
         */
    }


}