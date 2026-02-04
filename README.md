# Java Exercises

---

```
jshell> Class<?> clazz = String.class;
clazz ==> class java.lang.String

jshell> clazz.ge <press tab>
getAnnotatedInterfaces()        getAnnotatedSuperclass()        getAnnotation(                  getAnnotations()                
getAnnotationsByType(           getCanonicalName()              getClass()                      getClassLoader()                
getClasses()                    getComponentType()              getConstructor(                 getConstructors()               
getDeclaredAnnotation(          getDeclaredAnnotations()        getDeclaredAnnotationsByType(   getDeclaredClasses()            
getDeclaredConstructor(         getDeclaredConstructors()       getDeclaredField(               getDeclaredFields()             
getDeclaredMethod(              getDeclaredMethods()            getDeclaringClass()             getEnclosingClass()             
getEnclosingConstructor()       getEnclosingMethod()            getEnumConstants()              getField(                       
getFields()                     getGenericInterfaces()          getGenericSuperclass()          getInterfaces()                 
getMethod(                      getMethods()                    getModifiers()                  getModule()                     
getName()                       getNestHost()                   getNestMembers()                getPackage()                    
getPackageName()                getPermittedSubclasses()        getProtectionDomain()           getRecordComponents()           
getResource(                    getResourceAsStream(            getSigners()                    getSimpleName()                 
getSuperclass()                 getTypeName()                   getTypeParameters()             
jshell> clazz.getSuperclass()
$2 ==> class java.lang.Object

jshell> clazz.getSuperclass().ge <press tab>
getAnnotatedInterfaces()        getAnnotatedSuperclass()        getAnnotation(                  getAnnotations()                
getAnnotationsByType(           getCanonicalName()              getClass()                      getClassLoader()                
getClasses()                    getComponentType()              getConstructor(                 getConstructors()               
getDeclaredAnnotation(          getDeclaredAnnotations()        getDeclaredAnnotationsByType(   getDeclaredClasses()            
getDeclaredConstructor(         getDeclaredConstructors()       getDeclaredField(               getDeclaredFields()             
getDeclaredMethod(              getDeclaredMethods()            getDeclaringClass()             getEnclosingClass()             
getEnclosingConstructor()       getEnclosingMethod()            getEnumConstants()              getField(                       
getFields()                     getGenericInterfaces()          getGenericSuperclass()          getInterfaces()                 
getMethod(                      getMethods()                    getModifiers()                  getModule()                     
getName()                       getNestHost()                   getNestMembers()                getPackage()                    
getPackageName()                getPermittedSubclasses()        getProtectionDomain()           getRecordComponents()           
getResource(                    getResourceAsStream(            getSigners()                    getSimpleName()                 
getSuperclass()                 getTypeName()                   getTypeParameters()             
jshell> clazz.getSuperclass().getName()
$3 ==> "java.lang.Object"

jshell> Method[] methods = clazz.getMe
getMethods()   

<press tab again to see all possible completions>
jshell> Method[] methods = clazz.getMethods()
methods ==> Method[93] { public boolean java.lang.String.equa ... ang.InterruptedException }

jshell> methods.length
$5 ==> 93

jshell> methods
methods ==> Method[93] { public boolean java.lang.String.equals(java.lang.Object), public int java.lang.String.length(), public java.lang.String java.lang.String.toString(), public int java.lang.String.hashCode(), public void java.lang.String.getChars(int,int,char[],int), public int java.lang.String.compareTo(java.lang.String), public int java.lang.String.compareTo(java.lang.Object), public int java.lang.String.indexOf(java.lang.String,int), public int java.lang.String.indexOf(java.lang.String,int,int), public int java.lang.String.indexOf(int), public int java.lang.String.indexOf(int,int), public int java.lang.String.indexOf(int,int,int), public int java.lang.String ... .lang.Object.notify(), public final native void java.lang.Object.notifyAll(), public final void java.lang.Object.wait(long) throws java.lang.InterruptedException, public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException, public final void java.lang.Object.wait() throws java.lang.InterruptedException }

jshell> class SecretAgent {
   ...>     private String codeName  = "Zoonie";
   ...> }
|  created class SecretAgent

jshell> SecretAgent sa = new SecretAgent();
sa ==> SecretAgent@2d38eb89

jshell> Field field = sa.getClass().getDeclaredField("codeName")
field ==> private java.lang.String SecretAgent.codeName

jshell> field.setAccessible(true)

jshell> field.get(sa)
$11 ==> "Zoonie"

jshell> field.get(sa)
$12 ==> "Zoonie"

jshell> field.set(sa, "Steve")

jshell> field.get(sa)
$14 ==> "Steve"
```

```
jshell> Object calc = new Calculator();
calc ==> Calculator@63c12fb0

jshell> String methodName = "add";
methodName ==> "add"

jshell> Method method = calc.getClass().getMethod(methodName, int.class, int.class)
method ==> public void Calculator.add(int,int)

jshell> method.invoke(calc, 10, 20)
Result: 30
$20 ==> null
```
