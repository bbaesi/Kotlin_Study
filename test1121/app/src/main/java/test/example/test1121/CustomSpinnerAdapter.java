package test.example.test1121;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
public class CustomSpinnerAdapter extends BaseAdapter {

    private final String[] list;
    private final LayoutInflater inflater;
    private String text;

    public CustomSpinnerAdapter(Context context, String[] list) {
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return list[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    // 화면에 들어왔을 때 보여지는 텍스트뷰 설정
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.spinner_out_view, parent, false);
        if (list != null) {
            text = list[position];
            ((TextView) convertView.findViewById(R.id.spinner_inner_text)).setText(text);
        }
        return convertView;
    }

    // 클릭 후 나타나는 텍스트뷰 설정
    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.spinner_in_view, parent, false);
        if (list != null) {
            text = list[position];
            ((TextView) convertView.findViewById(R.id.spinner_text)).setText(text);
        }

        return convertView;
    }

    // 스피너에서 선택된 아이템을 액티비티에서 꺼내오는 메서드
    public String getItem() {
        return text;
    }
}