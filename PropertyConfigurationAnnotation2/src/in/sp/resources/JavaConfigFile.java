package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("in.sp.beans")
//For scanning multiple packages - @ComponentScan({"in.sp.beans","in.sp.beans2","in.sp.beans3","in.sp.beans4"})
//In more sophisticated way - @ComponentScan(basePackages={"in.sp.beans1","in.sp.beans2"})
public class JavaConfigFile {
	
}
