package com.example.conversationdetails

import android.app.PendingIntent.getActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.conversationdetails.fragments.ChatScreen
import com.example.conversationdetails.fragments.ConversationFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ConversationFragment.notifyActivity{



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragment1()
        
    }


    fun showFragment1()
    {

        val trans= supportFragmentManager.beginTransaction()
        val frag1= ConversationFragment()
        trans.replace(R.id.fragmentHolder,frag1)
        trans.addToBackStack(null)
        trans.commit()
    }
    fun showFragment2( conversationId: Int, msgId: Int)
    {
        val trans= supportFragmentManager.beginTransaction()
        val frag2= ChatScreen()
        frag2.setLoadMessageDetails(conversationId,msgId)
        trans.replace(R.id.fragmentHolder,frag2)
        trans.addToBackStack("Fragment2")
        trans.commit()
    }

    override fun onFragmentClicked(position: Int, conversationId: Int, msgId: Int) {
       showFragment2(conversationId,msgId)
    }
}

