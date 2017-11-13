package hu.kalo.robert.firstvaadin;

import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.TextField;

public class CustomerForm {
  private TextField firstName = new TextField( "First name" );
  private TextField lastName = new TextField( "Last name" );
  private TextField email = new TextField( "Email" );
  private NativeSelect<CustomerStatus> status = new NativeSelect<>( "Status" );
  private DateField birthdate = new DateField( "Birthday" );
  private Button save = new Button( "Save" );
  private Button delete = new Button( "Delete" );
}
