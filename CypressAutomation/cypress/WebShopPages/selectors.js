class Locators{
    constructor(){
        this.login = {
            weblogo: "img[alt='Tricentis Demo Web Shop']",
            loginlink: ".ico-login",
            emailbox: "#Email",
            passwordbox: "#Password",
            loginbutton: "input[value='Log in']",
            verifyloginEmailDisp: "div[class='header-links'] a[class='account']",
            welcomeLogin: "div[class='page-title'] h1"
        }


        this.search = {
            searchbox: "#small-searchterms",
            searchbutton: "input[value='Search']",
            searchresult: "h2[class='product-title']a",
            searchVerify: "#Q"
        }
        this.cartpage = {
            addtocart: "#add-to-cart-button-31",
            shoppingcartLink: "a[class='ico-cart'] span[class='cart-label']",
            shoppingcartverify: ".cart-qty",
            shpppingcartPage: "div[class='page-title'] h1",
            countryselect: "#CountryId",
            estimateShipping: "input[value='Estimate shipping']",
            pincodeEnter: "#ZipPostalCode",
            quantityEnter: "input[value='2']",
            totalVerify: "div[class='block block-category-navigation'] li:nth-child(1) a:nth-child(1)",
            checkout: "#checkout",
            checkoutverify: "div[class='page-title'] h1",
            logout: ".ico-logout",
            stateSelect: '#StateProvinceId',
            termsofSvc: "#termsofservice"
        }
    }
}
export default new Locators();