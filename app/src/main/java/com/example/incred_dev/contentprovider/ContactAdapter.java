package com.example.incred_dev.contentprovider;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/**
 * Created by incred-dev on 1/6/18.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

//    List<String> list;
//    List<String> listContact;
    List<ContactModel> contactModels;

//    public ContactAdapter(List<String> list, List<String> listContact) {
//        this.list = list;
//        this.listContact = listContact;
//    }

    public ContactAdapter(List<ContactModel> contactModels){
        this.contactModels = contactModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contect_name,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        String n = list.get(holder.getAdapterPosition());
//        String contactNumber = listContact.get(holder.getAdapterPosition());
//        if (n != null){
//            holder.name.setText(n);
//
//            if (contactNumber != null){
//                holder.number.setText(contactNumber);
//            }
//        }

        ContactModel model = contactModels.get(holder.getAdapterPosition());
        if (model != null){
            if (model.getName() != null){
                holder.name.setText(model.getName());
            }
            if (model.getNumber() != null){
                StringBuffer stringBuffer = new StringBuffer();
                for (String number:model.getNumber()){
                    stringBuffer.append(number).append("\n");
                }
                holder.number.setText(stringBuffer);
            }

        }

    }

    @Override
    public int getItemCount() {
        return contactModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView number;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.tvName);
            number =  (TextView)itemView.findViewById(R.id.tvNumber);
        }

    }
}
