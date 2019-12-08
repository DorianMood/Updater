package updater

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var arr: ArrayList<String> = arrayListOf(
                "https://www.ebay.com/itm/Apple-iphone-7-Plus-32GB-4G-LTE-Sprint-Smartphone-1-Year-Warranty-A/193147105319?var=493330321147",
                "https://www.ebay.com/itm/APPLE-IPHONE-7-PLUS-A1661-32GB-SPRINT-BLACK-5-5-12MP-4G-LTE-iOS-SMARTPHONE/202843769732?_trkparms=aid%3D1110001%26algo%3DSPLICE.SIM%26ao%3D2%26asc%3D20160323102634%26meid%3Dc1b7d8abe5fa47979392f6e5a9470ca7%26pid%3D100623%26rk%3D3%26rkt%3D6%26sd%3D193147105319%26itm%3D202843769732%26pmt%3D0%26noa%3D1%26pg%3D2047675&_trksid=p2047675.c100623.m-1",
                "https://www.ebay.com/itm/Ray-Ban-Wayfarer-Black-54mm-Large-Size-RB-2140-901-G15-Lenses/202779034259?_trkparms=aid%3D777001%26algo%3DDISCO.FEED%26ao%3D1%26asc%3D20180911133149%26meid%3Db7b997fc4e274468a9171221ed79af62%26pid%3D101002%26rk%3D1%26rkt%3D1%26itm%3D202779034259%26pmt%3D0%26noa%3D1%26pg%3D2380057&_trksid=p2380057.c101002.m4497&_trkparms=pageci%3A081e85ac-0799-11ea-817e-74dbd180ae39%7Cparentrq%3A6ec5228d16e0a489add86eaffff4fc6c%7Ciid%3A1"
            )
            var result: ArrayList<Double> = Updater.update(arr)
            for (res in result) {
                println(res)
            }
        }
    }
}