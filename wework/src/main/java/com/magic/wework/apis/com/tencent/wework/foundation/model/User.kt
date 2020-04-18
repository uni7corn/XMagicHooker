//package com.magic.wework.apis.com.tencent.wework.foundation.model
//
//import com.magic.kernel.core.Clazz
//import com.magic.wework.mirror.com.tencent.wework.foundation.model.Methods
//import com.magic.wework.apis.com.tencent.wework.foundation.model.pb.WwUser
//import com.magic.wework.mirror.com.tencent.wework.foundation.model.Classes
//import de.robv.android.xposed.XposedHelpers
//
///**
// * @param original com.tencent.wework.foundation.model.User
// */
//data class User(var original: Any) {
//
//    companion object {
//
//        /**
//         * 获取一个临时的User
//         */
//        fun getTemp() =
//            XposedHelpers.callStaticMethod(Classes.User, Methods.User.getTemp.name)
//
//        fun setInfo(original: Any, info: Any) =
//            XposedHelpers.callMethod(original, Methods.User.setInfo.name, info)
//
//        /**
//         * @return com.tencent.wework.foundation.model.pb.WwUser.User
//         */
//        fun getInfo(original: Any): Any =
//            XposedHelpers.callMethod(original, Methods.User.getInfo.name)
//
//        /**
//    }
//
