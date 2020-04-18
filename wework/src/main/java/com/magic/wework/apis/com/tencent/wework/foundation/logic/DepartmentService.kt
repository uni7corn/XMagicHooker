//package com.magic.wework.apis.com.tencent.wework.foundation.logic
//
//import com.magic.kernel.core.Clazz
//import com.magic.wework.mirror.com.tencent.wework.foundation.observer.Classes.IDepartmentServiceObserver
//import com.magic.wework.mirror.com.tencent.wework.foundation.callback.Classes.ICommonResultCallback
//import com.magic.wework.mirror.com.tencent.wework.foundation.callback.Classes.IGetChildDepartmentsCallback
//import com.magic.wework.mirror.com.tencent.wework.foundation.callback.Classes.IGetDepartmentUserIDMapCallback
//import com.magic.wework.mirror.com.tencent.wework.foundation.callback.Classes.IGetParentDepartmentCallback
//import com.magic.wework.mirror.com.tencent.wework.foundation.callback.Classes.IGetUserByIdCallback
//import com.magic.wework.mirror.com.tencent.wework.foundation.callback.Classes.IModifyAvatarCallback
//import com.magic.wework.mirror.com.tencent.wework.foundation.model.Classes.Department
//import com.magic.wework.mirror.com.tencent.wework.foundation.logic.Classes
//import com.magic.wework.mirror.com.tencent.wework.foundation.logic.Methods
//import de.robv.android.xposed.XposedHelpers
//
//object DepartmentService {
//
//    fun getService(): Any =
//        XposedHelpers.callStaticMethod(
//            Classes.DepartmentService,
//            Methods.DepartmentService.getService.name
//        )
//
//    /**
//     * 添加部门变化监听
//     */
//    fun addObserver(iDepartmentServiceObserver: Any) =
//        XposedHelpers.callMethod(
//            getService(), Methods.DepartmentService.AddObserver.name,
//            arrayOf(IDepartmentServiceObserver), iDepartmentServiceObserver
//        )
//
//    /**
//
//}