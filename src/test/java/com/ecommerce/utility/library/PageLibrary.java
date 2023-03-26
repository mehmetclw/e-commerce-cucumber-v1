package com.ecommerce.utility.library;


import com.ecommerce.pages.customeraccounts.AccountManagementFunctionalityPages;
import com.ecommerce.pages.homepage.SearchFunctionalityPages;
import com.ecommerce.pages.products.ItemDetailsVerificationPages;
import com.ecommerce.pages.shoppingcart.ReturningUserPurchasePages;

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
  /*  private HomePage hPage;
    private LoginFunctionalityPage loginFunctionalityPage;
    private FooterLinksPages flp;
    private NewsletterFunctionalityPage nfp;
    private SubmissionOfFormPage sofp;
    private ShoppingCartProductQuantityPages scpqp;*/

    public PageLibrary() {
      /*  urp = new UserRegistrationPages();
        tnp = new TestTheNavigationPages();
        scp = new ShoppingCartPages();*/
        sfp = new SearchFunctionalityPages();
        idv = new ItemDetailsVerificationPages();
       /* urnp = new UserRegistrationNewPages();
        tsop = new TestShippingOptionsPages();*/
        amfp = new AccountManagementFunctionalityPages();
      /*  hPage=new HomePage();
        loginFunctionalityPage=new LoginFunctionalityPage();
        flp= new FooterLinksPages();
        nfp = new NewsletterFunctionalityPage();
        sofp = new SubmissionOfFormPage();
        scpqp= new ShoppingCartProductQuantityPages();*/
        rup = new ReturningUserPurchasePages();
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

    /*  public HomePage getHPage() {
          return hPage;
      }

      public LoginFunctionalityPage getLoginFunctionalityPage() {
          return loginFunctionalityPage;
      }
      public FooterLinksPages getFlp(){return flp;}
      public NewsletterFunctionalityPage getNfp(){return nfp;}
      public SubmissionOfFormPage getSofp(){return sofp;}
      public ShoppingCartProductQuantityPages getScpqp(){return scpqp;}
     */
    public ReturningUserPurchasePages getRup() {
        return rup;
    }

}



