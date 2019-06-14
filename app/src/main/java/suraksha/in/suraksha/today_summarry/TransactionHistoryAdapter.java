package suraksha.in.suraksha.today_summarry;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import suraksha.in.suraksha.R;

public class TransactionHistoryAdapter extends RecyclerView.Adapter<TransactionHistoryAdapter.ViewHolder> {

    private List<TransactionHistory> items;
    private Context context;

    public TransactionHistoryAdapter(List<TransactionHistory> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_details, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TransactionHistory item = items.get(position);
        holder.transactionType.setText(item.getTransactionType());
        holder.customerName.setText(item.getCustomerName());
        holder.transactionTime.setText(item.getTransactionTime());
        holder.transactionAmount.setText(item.getTransactionAmount());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView transactionType;
        private TextView customerName;
        private TextView transactionTime;
        private TextView transactionAmount;

        public ViewHolder(View itemView) {
            super(itemView);
            transactionType = itemView.findViewById(R.id.transaction_type);
            customerName = itemView.findViewById(R.id.customer_name);
            transactionTime = itemView.findViewById(R.id.transaction_time);
            transactionAmount = itemView.findViewById(R.id.transaction_amount);
        }
    }
}
