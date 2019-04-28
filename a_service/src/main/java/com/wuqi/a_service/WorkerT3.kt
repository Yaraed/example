package com.wuqi.a_service

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.weyee.sdk.toast.ToastUtils

/**
 *
 * @author wuqi by 2019/4/17.
 */
class WorkerT3(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
    override fun doWork(): Result {
        ToastUtils.show("doWorker3")
        return Result.success()

    }
}
