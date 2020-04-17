package ru.evtukhov.android.homework5.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ru.evtukhov.android.homework5.posts.Post

abstract class BaseViewHolder (adapter: PostAdapter, view: View): RecyclerView.ViewHolder(view) {
    abstract fun join (post: Post)
}