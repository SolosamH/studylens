package com.example.final_project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class TrangChuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Chỉ cần Inflate giao diện lên là đủ
        return inflater.inflate(R.layout.fragment_trang_chu, container, false)
    }
}