package com.ecommerce.utility.library;


import com.ecommerce.pages.customeraccounts.AccountManagementFunctionalityPages;
import com.ecommerce.pages.homepage.FooterLinksPages;
import com.ecommerce.pages.homepage.SearchFunctionalityPages;
import com.ecommerce.pages.products.ItemDetailsVerificationPages;
import com.ecommerce.pages.shoppingcart.ReturningUserPurchasePages;
import com.ecommerce.pages.shoppingcart.ShoppingCartProductQuantityPages;

public class PageLibrary {
    /*    private UserRegistrationPages urp;

        private TestTheNavigationPages tnp;
        private ShoppingCartPages scp;*/
    private SearchFunctionalityPages sfp;
    private ReturningUserPurchasePages rup;
    private ItemDetailsVerificationPages idv;
    /*   private UserRegistrationNewPages urnp;
       private TestShippingOptionsPages tsop;*/
    private AccountManagementFunctionalityPages amfp;
    private ShoppingCartProductQuantityPages scpqp;
    private FooterLinksPages flp;
  /*  private HomePage hPage;
    private LoginFunctionalityPage loginFunctionalityPage;

    private NewsletterFunctionalityPage nfp;
    private SubmissionOfFormPage sofp;
    */

    public PageLibrary() {
      /*  urp = new UserRegistrationPages();
        tnp = new TestTheNavigationPages();
        scp = new ShoppingCartPages();*/
        sfp = new SearchFunctionalityPages();
        idv = new ItemDetailsVerificationPages();
       /* urnp = new UserRegistrationNewPages();
        tsop = new TestShippingOptionsPages();*/
        amfp = new AccountManagementFunctionalityPages();
        scpqp= new ShoppingCartProductQuantityPages();
        flp= new FooterLinksPages();
      /*  hPage=new HomePage();
        loginFunctionalityPage=new LoginFunctionalityPage();

        nfp = new NewsletterFunctionalityPage();
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

    public ShoppingCartPages getScp() {
        return scp;
    }*/

    public SearchFunctionalityPages getSfp() {
        return sfp;
    }

    public ItemDetailsVerificationPages getIdv() {
        return idv;
    }

  /*  public UserRegistrationNewPages getUrnp() {
        return urnp;
    }

    public TestShippingOptionsPages getTsop() {
        return tsop;
    }*/

    public AccountManagementFunctionalityPages getAmfp() {
        return amfp;
    }
    public ShoppingCartProductQuantityPages getScpqp(){return scpqp;}
    public ReturningUserPurchasePages getRup(){return rup;}

    public FooterLinksPages getFlp(){return flp;}
  /*  public HomePage getHPage() {
        return hPage;
    }

    public LoginFunctionalityPage getLoginFunctionalityPage() {
        return loginFunctionalityPage;
    }

    public NewsletterFunctionalityPage getNfp(){return nfp;}
    public SubmissionOfFormPage getSofp(){return sofp;}

   */
}



