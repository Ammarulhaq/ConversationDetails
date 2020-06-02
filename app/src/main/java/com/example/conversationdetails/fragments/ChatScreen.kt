package com.example.conversationdetails.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.conversationdetails.R
import com.example.conversationdetails.retrofitservices.CustomCallback
import com.example.conversationdetails.retrofitservices.RetrofitJSONResponse
import com.example.conversationdetails.webservicesinterfaceshandlers.WebServicesHandler


class ChatScreen : Fragment() {

    var ConversationID:Int=-1
    var MsgID:Int=-1

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragmenttwo,container,false)
    }

    override fun onStart() {
        super.onStart()
        GetMsgDetails()

    }

    fun setLoadMessageDetails(conversationId:Int,msgId:Int)
    {
        this.ConversationID=conversationId
        this.MsgID=msgId

    }
    fun GetMsgDetails()
    {
//        WebServicesHandler.instance.loadMoreMessages("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjb21wYW55X2lkIjoiMTg4IiwiZW1haWwiOiJoYW1tYWRAd3VycWkuY29tIiwicmVzb3VyY2VfaWQiOjEzMiwiZXhwIjoxNTkxMzQyODc4fQ.lJXWPQiS_vmjiUddsD_7TCeDenKX2XTAAywBugaIkrg",object : CustomCallback<RetrofitJSONResponse?>()
//        {
//
//        })
//
    }
}