package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User> {
   private User user=new User();
   
   private UserService userService;
   
   public void setUserService(UserService userService) {
    this.userService = userService;
}
   
   private Integer id;
   
   public void setId(Integer id) {
    this.id = id;
}
   
    
   public String findById(){
       user=userService.findById(user.getId());
       
     ActionContext.getContext().getValueStack().push(user);
       return "success";
   }
   
   
   
    
    @Override
    public User getModel() {
          
        return user;
    }

    

}
  
