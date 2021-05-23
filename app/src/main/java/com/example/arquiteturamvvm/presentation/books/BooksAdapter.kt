package com.example.arquiteturamvvm.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.arquiteturamvvm.R
import com.example.arquiteturamvvm.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksAdapter(
    private val books:List<Book>
) :RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    //Montando o layout de cada item do recyclerview
    override fun onCreateViewHolder(parent: ViewGroup, view: Int): BooksViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_book,parent,false)

        return BooksViewHolder(itemView)
    }

    //Retorna a quantidade de itens da lista
    override fun getItemCount() = books.count()


    //Faz a ligação de cada itens da lista com o do recyclerview
    override fun onBindViewHolder(viewHolder: BooksViewHolder, position: Int) {
        viewHolder.bindView(books[position])

    }

    class BooksViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        private val title = itemView.text_title
        private val author= itemView.text_author

        fun bindView(book:Book){
            title.text = book.title
            author.text = book.author
        }
    }

}