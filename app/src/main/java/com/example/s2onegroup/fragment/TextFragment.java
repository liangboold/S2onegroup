package com.example.s2onegroup.fragment;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.blankj.utilcode.util.GsonUtils;
import com.bw.mvvm_library.repository.BaseRepository;
import com.bw.mvvm_library.util.ImgUtil;
import com.bw.mvvm_library.view.BaseMVVMFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.net.protocol.BaseRespEntry;
import com.example.s2onegroup.BR;
import com.example.s2onegroup.R;
import com.example.s2onegroup.bean.TextBean;
import com.example.s2onegroup.databinding.TextF;
import com.example.s2onegroup.viewmodel.TextViewModel;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TextFragment extends BaseMVVMFragment<TextViewModel, TextF> {
    ArrayList<TextBean.TextOneBean> textOneBeans = new ArrayList<>();

    @Override
    protected void initEvent() {
    }

    @Override
    protected void loadData() {
        requestData();
        mBinding.textRv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private void requestData() {
//        mViewModel.baseRespEntryLiveData().observe(this, new Observer<BaseRespEntry<TextBean>>() {
//            @Override
//            public void onChanged(BaseRespEntry<TextBean> textBeanBaseRespEntry) {
//                System.out.println(textBeanBaseRespEntry);
//            }
//        });
    }

    public class MyText extends BaseQuickAdapter<TextBean.TextOneBean, BaseViewHolder>{

        public MyText(@Nullable List<TextBean.TextOneBean> data) {
            super(R.layout.text_item, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, TextBean.TextOneBean item) {
            helper.setText(R.id.name,item.getAuthor().getName());
            helper.setText(R.id.feeds_text,item.getFeeds_text());
            ImgUtil.imgLoadCircle(getActivity(),item.getAuthor().getAvatar(),helper.getView(R.id.avatar));
        }
    }

    @Override
    protected TextViewModel createViewModel() {
        return new TextViewModel(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_text;
    }

    @Override
    protected void prepareSetVars(HashMap mMap) {
        mMap.put(BR.TexTF,this);
    }

    @Override
    protected void injectCompoent() {

    }
}