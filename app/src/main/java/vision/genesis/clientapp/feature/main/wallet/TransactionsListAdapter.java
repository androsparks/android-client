package vision.genesis.clientapp.feature.main.wallet;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.swagger.client.model.WalletTransaction;
import vision.genesis.clientapp.R;
import vision.genesis.clientapp.utils.DateTimeUtil;

/**
 * GenesisVision
 * Created by Vitaly on 1/25/18.
 */

public class TransactionsListAdapter extends RecyclerView.Adapter<TransactionsListAdapter.TransactionViewHolder>
{
	public List<WalletTransaction> transactions = new ArrayList<>();

	@Override
	public TransactionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_transaction, parent, false);
		return new TransactionViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(TransactionViewHolder holder, int position) {
		holder.setTransaction(transactions.get(position));
	}

	@Override
	public int getItemCount() {
		return transactions.size();
	}

	void setTransactions(List<WalletTransaction> transactions) {
		this.transactions.clear();
		this.transactions.addAll(transactions);
		notifyDataSetChanged();
	}

	void addTransactions(List<WalletTransaction> investmentPrograms) {
		this.transactions.addAll(investmentPrograms);
		notifyDataSetChanged();
	}

	static class TransactionViewHolder extends RecyclerView.ViewHolder
	{
		@BindView(R.id.type)
		public TextView type;

		@BindView(R.id.date)
		public TextView date;

		@BindView(R.id.amount)
		public TextView amount;

		private WalletTransaction transaction;

		private Context context;

		TransactionViewHolder(View itemView) {
			super(itemView);

			ButterKnife.bind(this, itemView);

			context = itemView.getContext();
		}

		void setTransaction(WalletTransaction transaction) {
			this.transaction = transaction;
			updateData();
		}

		private void updateData() {
			setType();
			date.setText(DateTimeUtil.formatDateTime(transaction.getDate()));
			setAmount();
		}

		private void setType() {
			switch (transaction.getType()) {
				case DEPOSIT:
					type.setText(context.getResources().getString(R.string.transaction_type_deposit));
					break;
				case WITHDRAW:
					type.setText(context.getResources().getString(R.string.transaction_type_withdraw));
					break;
				case OPENPROGRAM:
					type.setText(context.getResources().getString(R.string.transaction_type_open_program));
					break;
				case INVESTTOPROGRAM:
					type.setText(context.getResources().getString(R.string.transaction_type_invest_to_program));
					break;
				case CANCELINVESTMENTREQUEST:
					type.setText(context.getResources().getString(R.string.transaction_type_cancel_investment_request));
					break;
				case WITHDRAWFROMPROGRAM:
					type.setText(context.getResources().getString(R.string.transaction_type_withdraw_from_program));
					break;
			}
		}

		private void setAmount() {
			double amountValue = transaction.getAmount();
			DecimalFormat df = new DecimalFormat("0.########");
			df.setRoundingMode(RoundingMode.DOWN);
			String amountString = df.format(amountValue);

			amount.setText(amountString);

			switch (transaction.getType()) {
				case DEPOSIT:
					amount.setTextColor(ContextCompat.getColor(context, R.color.transactionGreen));
					break;
				case WITHDRAW:
					amount.setTextColor(ContextCompat.getColor(context, R.color.transactionRed));
					break;
				case OPENPROGRAM:
					amount.setTextColor(ContextCompat.getColor(context, R.color.transactionRed));
					break;
				case INVESTTOPROGRAM:
					amount.setTextColor(ContextCompat.getColor(context, R.color.transactionRed));
					break;
				case WITHDRAWFROMPROGRAM:
					amount.setTextColor(ContextCompat.getColor(context, R.color.transactionGreen));
					break;
				case PROFITFROMPROGRAM:
					amount.setTextColor(ContextCompat.getColor(context, R.color.transactionGreen));
					break;
				case CANCELINVESTMENTREQUEST:
					amount.setTextColor(ContextCompat.getColor(context, R.color.transactionGreen));
					break;
				case PARTIALINVESTMENTEXECUTIONREFUND:
					amount.setTextColor(ContextCompat.getColor(context, R.color.transactionGreen));
					break;
			}
		}
	}
}
