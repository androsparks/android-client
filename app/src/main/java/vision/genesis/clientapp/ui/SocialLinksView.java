package vision.genesis.clientapp.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.swagger.client.model.SocialLinkViewModel;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.utils.ImageUtils;
import vision.genesis.clientapp.utils.TypedValueFormatter;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 08/07/2019.
 */

public class SocialLinksView extends RelativeLayout
{
	@BindView(R.id.group)
	public LinearLayout group;

	protected Unbinder unbinder;

	public SocialLinksView(Context context) {
		super(context);
		initView();
	}

	public SocialLinksView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView();
	}

	public SocialLinksView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initView();
	}

	protected void initView() {
		inflate(getContext(), R.layout.view_social_links, this);

		unbinder = ButterKnife.bind(this);
	}

	public void onDestroy() {
		if (unbinder != null) {
			unbinder.unbind();
			unbinder = null;
		}
	}

	public void setData(List<SocialLinkViewModel> socialLinks) {
		if (group != null) {
			group.removeAllViews();
			for (SocialLinkViewModel socialLink : socialLinks) {
				if (!socialLink.getType().equals(SocialLinkViewModel.TypeEnum.UNDEFINED))
					addViewToGroup(createSocialLinkView(socialLink));
			}
		}
	}

	private void addViewToGroup(View view) {
		group.addView(view);
		LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) view.getLayoutParams();
		lp.width = TypedValueFormatter.toDp(32);
		lp.height = TypedValueFormatter.toDp(32);
		lp.setMargins(TypedValueFormatter.toDp(20), 0, 0, 0);
		view.setLayoutParams(lp);
	}

	private View createSocialLinkView(SocialLinkViewModel data) {
		SimpleDraweeView view = new SimpleDraweeView(getContext());
		view.setImageURI(ImageUtils.getImageUri(data.getLogo()));
		view.setOnClickListener(view1 -> {
			Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(data.getUrl().concat(data.getValue())));
			getContext().startActivity(browserIntent);
		});
		return view;
	}
}