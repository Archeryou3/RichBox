package com.example.richbox.EichText.weight;




public interface ImageActionListener {
      int  ACT_DELETE=0;
      int  ACT_REPLACE=1;
      int  ACT_PREVIEW=2;

      void onAction(int action, ImageWeight imageWeight);

}
