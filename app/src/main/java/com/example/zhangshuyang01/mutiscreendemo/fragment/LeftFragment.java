package com.example.zhangshuyang01.mutiscreendemo.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.zhangshuyang01.mutiscreendemo.BasePadFragment;
import com.example.zhangshuyang01.mutiscreendemo.R;

/**
 * Created by zhangshuyang01 on 2017/10/19 0019.
 */

public class LeftFragment extends BasePadFragment implements View.OnClickListener{

    private Button btnNextPage,btnNextAnother;
    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_left, null);
        btnNextPage = (Button)view.findViewById(R.id.btn_next_page);
        btnNextAnother = (Button)view.findViewById(R.id.btn_next_another);
        btnNextPage.setOnClickListener(this);
        btnNextAnother.setOnClickListener(this);
        mRecyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        // 设置布局管理器
        mRecyclerView.setLayoutManager(layoutManager);

        String[] dataset = new String[100];
        for (int i = 0; i < dataset.length; i++) {
            dataset[i] = "item" + i;
        }
        RecyclerAdapter mAdapter = new RecyclerAdapter(dataset);
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_next_page:
                AnotherFragment anotherFragment  = new AnotherFragment();
                startToFragment(getActivity(), R.id.layout_container, anotherFragment);
//                startToAnotherFragment(anotherFragment);
                break;
            case R.id.btn_next_another:
                NextAnotherFragment nextAnotherFragment = new NextAnotherFragment();
                startToFragment(getActivity(),R.id.layout_container,nextAnotherFragment);
//                startToAnotherFragment(nextAnotherFragment);
                break;
            default:
                break;
        }
    }

    public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
        private String[] mDataset;

        /**
         * @Description: TODO
         */
        public RecyclerAdapter(String[] dataset) {
            mDataset = dataset;
        }

        public  class ViewHolder extends RecyclerView.ViewHolder {

            public TextView mTextView;

            /**
             * @Description: TODO
             * @param itemView
             */
            public ViewHolder(View itemView) {
                super(itemView);
                mTextView = (TextView) itemView;
            }
        }

        /**
         * @Method: getItemCount
         * @Description: TODO
         * @return
         * @see android.support.v7.widget.RecyclerView.Adapter#getItemCount()
         */
        @Override
        public int getItemCount() {
            return mDataset.length;
        }

        /**
         * @Method: onBindViewHolder
         * @Description: TODO
         * @param holder
         * @param position
         * @see android.support.v7.widget.RecyclerView.Adapter#onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder,
         *      int)
         */
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.mTextView.setText(mDataset[position]);
        }

        /**
         * @Method: onCreateViewHolder
         * @Description: TODO
         * @param parent
         * @param viewType
         * @return
         * @see android.support.v7.widget.RecyclerView.Adapter#onCreateViewHolder(android.view.ViewGroup,
         *      int)
         */
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = View.inflate(parent.getContext(),
                    android.R.layout.simple_list_item_1, null);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }
    }
}
