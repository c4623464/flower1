
function focuspwd()
  {
  this.form1.pwd1.focus();
  }
  function modpwd()
  {
  if(this.form1.pwd1.value=="")
  {
  window.alert("璇疯緭鍏ユ棫瀵嗙爜");
  form1.pwd1.focus();
  return false;
  
  }
  
    if(this.form1.pwd2.value=="")
  {
   window.alert("杈撳叆浣犵殑鏂板瘑鐮�");
  form1.pwd2.focus();
  return false;
  
  }
    if(this.form1.password.value=="")
  {
   window.alert(" 璇峰啀娆¤緭鍏ヤ綘鐨勬柊瀵嗙爜");
  form1.password.focus();
  return false;
  
  }
    if(this.form1.pwd2.value!=this.form1.password.value)
    {
     window.alert("涓ゆ瀵嗙爜涓嶄竴鑷�");
    form1.pwd2.focus();
    return false;
    
    }
    }
