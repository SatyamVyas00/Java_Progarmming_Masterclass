package academy.learnprograming;

import java.util.ArrayList;

public class MobilePhone {
    private  String myNumber;
    private  ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact newContact)
    {
        if(findContact(newContact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(newContact);
        return true;
    }

    public boolean updateContact(Contact oldContact,Contact newContact)
    {
        if(findContact(newContact.getName())!=-1)
        {
            System.out.println("Contact with that name already Exists. Update Failed");
            return false;
        }
        if(!addNewContact(oldContact))
        {
            int position = myContacts.indexOf(oldContact);
            myContacts.set(position,newContact);
            return true;
        }
        else
            return false;
    }

    public boolean removeContact(Contact toRemove)
    {
        if(!addNewContact(toRemove))
        {
            myContacts.remove(toRemove);
            return true;
        }
        else
            return false;
    }

    private int findContact(Contact toFind)
    {
    return myContacts.indexOf(toFind);
    }

    private int findContact(String contactName) {
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }


    public Contact queryContact(String toQuery)
    {
        int position = findContact(toQuery);
        return myContacts.get(position);
    }
    public void printContacts()
    {
        System.out.println("Contact List:");
        for (int i=0;i<myContacts.size();i++)
        System.out.println((i+1)+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber());
    }
}
