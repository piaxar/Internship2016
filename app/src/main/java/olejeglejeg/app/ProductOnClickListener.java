package olejeglejeg.app;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class ProductOnClickListener implements View.OnClickListener {
    private Product product;
    private Context context;

    public ProductOnClickListener(Product product, Context context) {
        this.context = context;
        this.product = product;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, "Product " + product.getName() + " added", Toast.LENGTH_SHORT).show();
        MainScene.productsInCheque.addProduct(product);
        MainScene.itemAdapter.notifyDataSetChanged();
        MainScene.updateSumm();
    }
}

