public class second_max{
	public static void main(String[] args){
		int array_value[ ]	={2,23,34,54,999,-32};
		int number =array_value.length;
		int i;
					for(int j	=0;j<number;j++)
					{
						System.out.print("\nArray value of index "+j);
						System.out.print(" "+array_value[j]);
					}
					//finding maximum
								int maximum	= array_value[0];
								int max_position=0;
									for(int j	=0;j<number;j++)
									{
											if(array_value[j]	> maximum)
											{
												maximum	=	array_value[j];
												max_position	=	j;
											}
									}
									System.out.print("\nMax value of array is "+maximum);
									System.out.print("\nPosition of Max element is "+max_position);
										
												int second_max=array_value[number - max_position	-1];
												
												for(int j=0;j<number;j++)
												{
													if(j	!=	max_position)
													{
																if(array_value[j]	> second_max)
																	second_max	= array_value[j];
													}
												}	
												System.out.print("\nSecond max is "+second_max);
												System.out.print("\nPosition is "+max_position);
								
								
	}
}	
						
						
