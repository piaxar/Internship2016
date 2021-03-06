package olejeglejeg.app;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by piaxar on 19.06.16.
 */
public class ChequeListOnClickListener implements View.OnClickListener {
    private Context context;
    private int position;

    public ChequeListOnClickListener(int position, Context context) {
        this.position = position;
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        MainScene.productsInCheque.deleteProduct(position);
        MainScene.itemAdapter.notifyDataSetChanged();
        MainScene.updateSumm();
        Toast.makeText(context, "Product deleted", Toast.LENGTH_SHORT).show();
    }
}
