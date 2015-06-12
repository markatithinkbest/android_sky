package com.giant.MrAction;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Profile03Adapter  extends BaseAdapter {  
  
    private Context context;  
    private List<Profile03Thing> lists;  
    private LayoutInflater layoutInflater;  
    
    TextView tv1;  
    TextView tv2;  
    TextView tv3;  
    TextView tv4;  
    TextView tv5;  
    TextView tv6;  
    TextView tv7; 
  
    /** 
     * 构造函数，进行初始化 
     *  
     * @param context 
     * @param lists 
     */  
    Profile03Adapter(Context context, List<Profile03Thing> lists) {  
        this.context = context;  
        this.lists = lists;  
        layoutInflater = LayoutInflater.from(this.context);  
    }  
  
    // 获得长度，一般返回数据的长度即可  
    @Override  
    public int getCount() {  
        return lists.size();  
    }  
  
    @Override  
    public Object getItem(int position) {  
        return lists.get(position);  
    }  
  
    @Override  
    public long getItemId(int position) {  
        return position;  
    }  
  
    /** 
     * 最重要的方法，每一个item生成的时候，都会执行这个方法，在这个方法中实现数据与item中每个控件的绑定 
     */  
    @Override  
    public View getView(int position, View convertView, ViewGroup parent) {  
        // convertView对象就是item的界面对象，只有为空的时候我们才需要重新赋值一次，这样可以提高效率，如果有这个对象的话，系统会自动复用  
        //item_listview就是自定义的item的布局文件  
        if (convertView == null) {  
            convertView = layoutInflater.inflate(R.layout.ponelist3, null);  
        }  
        //注意findViewById的时候，要使用convertView的这个方法，因为是在它里面进行控件的寻找  
      
        tv1 = (TextView) convertView.findViewById(R.id.mp31);  
        tv2 = (TextView) convertView.findViewById(R.id.mp32);  
        tv3 = (TextView) convertView.findViewById(R.id.mp33);  
        tv4 = (TextView) convertView.findViewById(R.id.mp34); 
        tv5 = (TextView) convertView.findViewById(R.id.mp35);  
        tv6 = (TextView) convertView.findViewById(R.id.mp36);  
        tv7 = (TextView) convertView.findViewById(R.id.mp37); 
        //将数据与控件进行绑定  
      
        tv1.setText(lists.get(position).getm1());  
        tv2.setText(lists.get(position).getm2()); 
        tv3.setText(lists.get(position).getm3());  
        tv4.setText(lists.get(position).getm4()); 
        tv5.setText(lists.get(position).getm5()); 
        tv6.setText(lists.get(position).getm6());  
        tv7.setText(lists.get(position).getm7());     
        
        return convertView;  
    }  
  
}  
