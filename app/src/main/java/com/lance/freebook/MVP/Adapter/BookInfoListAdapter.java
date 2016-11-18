package com.lance.freebook.MVP.Adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.lance.freebook.MVP.Entity.BookInfoListDto;
import com.lance.freebook.R;
import com.xiaochao.lcrapiddeveloplibrary.BaseQuickAdapter;
import com.xiaochao.lcrapiddeveloplibrary.BaseViewHolder;

import java.util.List;

/**
 * Created by Administrator on 2016/8/3.
 */
public class BookInfoListAdapter extends BaseQuickAdapter<BookInfoListDto> {

    public BookInfoListAdapter(int layoutResId, List<BookInfoListDto> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, BookInfoListDto item) {
        Glide.with(mContext)
                .load(item.getImageUrl())
                .crossFade()
                .placeholder(R.mipmap.nocover)
                .into((ImageView) helper.getView(R.id.book_info_image_url));
        helper.setText(R.id.book_info_textview_name,item.getBookName());
        helper.setText(R.id.book_info_textview_author,item.getAuthor());
        helper.setText(R.id.book_info_textview_introduction,"简介:"+item.getIntroduction());
    }
}
