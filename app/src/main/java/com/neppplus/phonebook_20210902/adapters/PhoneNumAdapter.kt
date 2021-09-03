package com.neppplus.phonebook_20210902.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.phonebook_20210902.R
import com.neppplus.phonebook_20210902.datas.PhoneNumData

class PhoneNumAdapter(
    val mContext : Context,
    resId : Int,
    val mList : List<PhoneNumData>) : ArrayAdapter<PhoneNumData>(mContext, resId, mList) {

    private val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        getView : xml (우리가 만든 xml로 커스텀) -> position에 맞는 데이터를 입혀서 -> 리스트뷰의 각 position에 뿌려주기.

        var row = convertView
        if (row == null) {
            row = mInflater.inflate(R.layout.phone_num_list_item, null)
        }

//        row!!  // 이미 row는 무조건 null 아니라고 우김.

//        이 밑으로는 row는 null이 아닌걸로 칠.
        val nameTxt = row!!.findViewById<TextView>(R.id.nameTxt)
        val birthDayTxt = row.findViewById<TextView>(R.id.birthDayTxt)


        return row

    }

}