fun main() {
   val nums = readLine()!!.split(" ").map{it.toInt()}
  
  var temp = 1
   while(true) {
		var cnt = 0
		
		for(i in 0..4){
			if(temp % nums[i] == 0) 
				cnt++
		}
		if(cnt > 2 )
			break
		temp++
   }
   
   print(temp)
   
}