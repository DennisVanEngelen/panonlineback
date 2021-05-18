package pandemiconline2.panonlinebackend.Logic.Models;

import pandemiconline2.panonlinebackend.DAL.DTO.UserDTO;
import  pandemiconline2.panonlinebackend.API.ViewModel.UserViewModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class User
{
    private long ID;
    private String Username;
    private String Password;
    private String EmailAddress;

    //Converters

    //Constructors
    public User(UserDTO user)
    {
        ID = user.getID();
        Username = user.getUsername();
        EmailAddress = user.getEmailAddress();
    }

    public User(UserViewModel user)
    {
        ID = user.getID();
        Username = user.getUsername();
        EmailAddress = user.getEmailAddress();
    }

    public void SaveUser()
    {

    }

    public void DeleteUser()
    {

    }

    public void UpdateUser()
    {

    }

}
