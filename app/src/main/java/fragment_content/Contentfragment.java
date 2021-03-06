package fragment_content;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gracker.tabfragment.R;

public class Contentfragment extends Fragment {

    TextView mTextView; // 显示的内容

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // super.onCreateView(inflater, container, savedInstanceState);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content, container, false);
    }

    public void changeContent(int index) {
        mTextView = (TextView) getActivity().findViewById(
                R.id.fragment_context_context);
        switch (index) {
            case 0:
                mTextView.setText(R.string.news_top_left_text);
                break;
            case 1:
                mTextView.setText(R.string.topic_top_left_text);
                break;
            case 2:
                mTextView.setText(R.string.picture_top_left_text);
                break;
            case 3:
                mTextView.setText(R.string.follow_top_left_text);
                break;
            case 4:
                mTextView.setText(R.string.vote_top_left_text);
                break;
            default:
                break;
        }
    }

}
