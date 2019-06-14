package suraksha.in.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import suraksha.in.suraksha.R;
import suraksha.in.suraksha.today_summarry.TransactionHistory;
import suraksha.in.suraksha.today_summarry.TransactionHistoryAdapter;

public class TodaySummaryFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<TransactionHistory> transactionHistories;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_today_summary,container,false);
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        transactionHistories = new ArrayList<>();
        addTransactionHistories();
        adapter = new TransactionHistoryAdapter(transactionHistories,getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setNestedScrollingEnabled(false);
        return view;
    }

    private void addTransactionHistories(){
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
        transactionHistories.add(new TransactionHistory("LOAN","Radha Krishna","12:00:12 am","₹ 250"));
    }

}
