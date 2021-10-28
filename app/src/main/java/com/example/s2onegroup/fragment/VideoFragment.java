package com.example.s2onegroup.fragment;

import android.view.View;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bw.mvvm_library.util.ImgUtil;
import com.bw.mvvm_library.view.BaseMVVMFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.net.protocol.BaseRespEntry;
import com.example.s2onegroup.BR;
import com.example.s2onegroup.R;
import com.example.s2onegroup.bean.VideoBean;
import com.example.s2onegroup.databinding.VideoF;
import com.example.s2onegroup.viewmodel.VideoViewModel;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class VideoFragment extends BaseMVVMFragment<VideoViewModel, VideoF> {
    ArrayList<VideoBean.VideoOneBean> videoOneBeans = new ArrayList<>();
    @Override
    protected void initEvent() {

    }

    @Override
    protected void loadData() {
        requestData();
        mBinding.VideoRv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private void requestData() {
//        mViewModel.baseRespEntryLiveData().observe(this, new Observer<BaseRespEntry<VideoBean>>() {
//            @Override
//            public void onChanged(BaseRespEntry<VideoBean> videoBeanBaseRespEntry) {
//                System.out.println(videoBeanBaseRespEntry);
//            }
//        });
    }

    public class MyVideo extends BaseQuickAdapter<VideoBean.VideoOneBean, BaseViewHolder> {

        public MyVideo(@Nullable List<VideoBean.VideoOneBean> data) {
            super(R.layout.video_item, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, VideoBean.VideoOneBean item) {
            helper.setText(R.id.name,item.getAuthor().getName());
            StandardGSYVideoPlayer gsy = helper.getView(R.id.gsy);
            gsy.setUp(item.getUrl(),true,null);
            gsy.startPlayLogic();
            ImgUtil.imgLoadCircle(getActivity(),item.getAuthor().getAvatar(),helper.getView(R.id.avatar));
        }
    }

    @Override
    protected void prepareSetVars(HashMap<Integer, Object> mMap) {
        mMap.put(BR.VideOF,this);
    }

    @Override
    protected VideoViewModel createViewModel() {
        return new VideoViewModel(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_video;
    }

    @Override
    protected void injectCompoent() {

    }
}