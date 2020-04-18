package com.magic.wework.apis.com.tencent.wework.msg.temp

class MsgApiImpl {

    companion object {
        private var instance: MsgApiImpl? = null

        @Synchronized
        fun newInstance(): MsgApiImpl {
            if (instance == null) {
                instance = MsgApiImpl()
            }
            return instance!!
        }

    }
        /** 获取实例 */
//        private fun getMsgApi(): Any = MK.service(IMsg)

//    fun sendRemoteFileMessage(id: Long, urlString: String, fileType: IHttpConfigs.Type, iSendRemoteFileMessageCallback: ICustomSendRemoteFileMessageCallback? = null) {
//        val inId = id
//        val inISendRemoteFileMessageCallback = iSendRemoteFileMessageCallback
//        HttpClients.download(urlString = urlString, type = fileType, iDownloadCallback = { localPath, type ->
//            if (localPath == null) {
//                }
//            }
//            when (type) {
//                IHttpConfigs.Type.DEFAULT,
//                IHttpConfigs.Type.FILE -> sendFileMessage(inId, localPath, iSendMessageCallback = iSendMessageCallback)
//                IHttpConfigs.Type.IMAGE -> sendImageMessage(inId, localPath, iSendMessageCallback = iSendMessageCallback)
//                IHttpConfigs.Type.VOICE -> {
//                    val retriever = MediaMetadataRetriever()
//                    retriever.setDataSource(localPath!!)
//                    val duration = ceil(retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION).toFloat() / 1000).toInt()
//                    retriever.release()
//                    Log.e(MsgApiImpl.javaClass.name, "语音消息时长: $duration   $localPath")
//                        false -> iSendRemoteFileMessageCallback?.invoke(false, "voice too long")
//                    }
//                }
//                IHttpConfigs.Type.VIDEO -> sendVideoMessage(inId, localPath, iSendMessageCallback = iSendMessageCallback)
//            }
//        })
//    }
//
}