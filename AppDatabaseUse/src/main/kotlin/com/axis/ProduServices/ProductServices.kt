package com.axis.ProduServices
import com.axis.ProductModal.product
import com.axis.ProductUtility.ProductUtility

class ProductServices{
    var productUtility=ProductUtility()

    fun insert() {
        var res=productUtility.insert()
        println(res)
    }
    fun viewAllProductDetails(){
        productUtility.selectAllDetails()
    }
    fun insertUserInput(product:product) {
        productUtility.userInputInsert(product)
    }

}