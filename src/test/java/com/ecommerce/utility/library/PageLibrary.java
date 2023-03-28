package com.ecommerce.utility.library;


import com.ecommerce.pages.customeraccounts.AccountManagementFunctionalityPages;
import com.ecommerce.pages.homepage.FooterLinksPages;
import com.ecommerce.pages.homepage.NewsletterFunctionalityPages;
import com.ecommerce.pages.homepage.RegistrationFunctionalityPages;
import com.ecommerce.pages.homepage.SearchFunctionalityPages;
import com.ecommerce.pages.products.ItemDetailsVerificationPages;
import com.ecommerce.pages.shoppingcart.ReturningUserPurchasePages;
import com.ecommerce.pages.shoppingcart.ShoppingCartFunctionalityPages;
import com.ecommerce.pages.shoppingcart.ShoppingCartProductQuantityPages;

public class PageLibrary {
    /*

        private TestTheNavigationPages tnp;
       */
    private RegistrationFunctionalityPages urp;
    private ShoppingCartFunctionalityPages scp;
    private SearchFunctionalityPages sfp;
    private ReturningUserPurchasePages rup;
    private ItemDetailsVerificationPages idv;
    /*   private UserRegistrationNewPages urnp;
       private TestShippingOptionsPages tsop;*/
    private AccountManagementFunctionalityPages amfp;
    private ShoppingCartProductQuantityPages scpqp;
    private FooterLinksPages flp;
    private NewsletterFunctionalityPages nfp;
  /*  private HomePage hPage;
    private LoginFunctionalityPage loginFunctionalityPage;


    private SubmissionOfFormPage sofp;
    */

    public PageLibrary() {
      /*
        tnp = new TestTheNavigationPages();
        */
        urp = new RegistrationFunctionalityPages();
        scp = new ShoppingCartFunctionalityPages();
        sfp = new SearchFunctionalityPages();
        idv = new ItemDetailsVerificationPages();
       /* urnp = new UserRegistrationNewPages();
        tsop = new TestShippingOptionsPages();*/
        amfp = new AccountManagementFunctionalityPages();
        scpqp= new ShoppingCartProductQuantityPages();
        flp= new FooterLinksPages();
        nfp = new NewsletterFunctionalityPages();
      /*  hPage=new HomePage();
        loginFunctionalityPage=new LoginFunctionalityPage();


        sofp = new SubmissionOfFormPage();
        */
       rup= new ReturningUserPurchasePages();
    }

/*    public UserRegistrationPages getUrp() {
        return urp;
    }

    public TestTheNavigationPages getTnp() {
        return tnp;
    }

   */
public RegistrationFunctionalityPages getUrp() {
    return urp;
}

    public SearchFunctionalityPages getSfp() {
        return sfp;
    }
    public ShoppingCartFunctionalityPages getScp() {
        return scp;
    }
    public ItemDetailsVerificationPages getIdv() {
        return idv;
    }

  /*
    public TestShippingOptionsPages getTsop() {
        return tsop;
    }*/

    public AccountManagementFunctionalityPages getAmfp() {
        return amfp;
    }
    public ShoppingCartProductQuantityPages getScpqp(){return scpqp;}
    public ReturningUserPurchasePages getRup(){return rup;}
    public NewsletterFunctionalityPages getNfp(){return nfp;}
    public FooterLinksPages getFlp(){return flp;}
  /*  public HomePage getHPage() {
        return hPage;
    }

    public LoginFunctionalityPage getLoginFunctionalityPage() {
        return loginFunctionalityPage;
    }


    public SubmissionOfFormPage getSofp(){return sofp;}

   */
}



