class TimedSemaphoresExample   
{  
private TimedSemaphore semaphore;  
TimedSemaphoreExample(long period, int slotLimit)   
{  
semaphore = new TimedSemaphore(period, TimeUnit.SECONDS, slotLimit);  
}  
boolean tryAdd()   
{  
return semaphore.tryAcquire();  
}  
int availableSlots()   
{  
return semaphore.getAvailablePermits();  
}  
}  