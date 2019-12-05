package com.example.electronicsapp

class DataSource {


    companion object {

        fun createDataSet(): ArrayList<ProductModel> {
            val list = ArrayList<ProductModel>()
            list.add(
                ProductModel(
                    "545",
                    "Apple MacBook Air)",
                    9,
                    "Red",
                    R.drawable.laptop,
                    "Apple MacBook AirAmazon Computers and Accessories showcases the latest computers and accessory products, including: desktops, laptops, tablets, computer components"
                )
            )

            list.add(
                ProductModel(
                    "445",
                    "I phone 6 Plus",
                    5,
                    "Black",
                    R.drawable.iphone,
                    "Apple MacBook AirAmazon Computers and Accessories showcases the latest computers and accessory products, including: desktops, laptops, tablets, computer components"
                )
            )

            list.add(
                ProductModel(
                    "668",
                    "HP OfficeJet Pro 6978",
                    5,
                    "Black",
                    R.drawable.printer,
                    "Printer type: All-in-one wireless printer. Main functions of this HP wireless printer include, copying, scanning, faxing, wireless, and two-sided printing."
                )
            )
            return list
        }
    }
}