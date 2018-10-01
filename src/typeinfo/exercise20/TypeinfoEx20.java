package typeinfo.exercise20;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.reflect.*;

public class TypeinfoEx20 {
    @SuppressWarnings({ "unused", "deprecation", "rawtypes" })
	public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: name of the class");
            System.exit(0);
        } else {
            Class<?> c1 = null;
            Class<?> c2 = null;
            Class<?> c3 = null;
            try {
                c1 = Class.forName(args[0]);
                c2 = Class.forName(args[0], true, TypeinfoEx20.class.getClassLoader());
                c3 = c1.asSubclass(Object.class);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            if (args[0].contains("java")) {
                Class<String> testClassType = String.class;
                Object o = new String();
                String test = testClassType.cast(o);
            } else {
                Class<TestClass> testClassType = TestClass.class;
                Object o = new TestClass();
                TestClass test = testClassType.cast(o);
            }

            System.out.println("Desired Assertion Status: " + c1.desiredAssertionStatus());
            AnnotatedType[] annotatedInterfaces = c1.getAnnotatedInterfaces();
            if (annotatedInterfaces.length > 0) {
                for (AnnotatedType annotatedInterface : annotatedInterfaces) {
                    System.out.println("Annotated Interface: " + annotatedInterface);
                }
            } else {
                System.out.println("No annotated interfaces");
            }

            System.out.println("Annotated super class: " + c1.getAnnotatedSuperclass());
            System.out.println("Documented annotation: " + c1.getAnnotation(Documented.class));

            Annotation[] annotations = c1.getAnnotations();
            if (annotations.length > 0) {
                for (Annotation annotation : annotations) {
                    System.out.println("Annotation: " + annotation);
                }
            } else {
                System.out.println("No annotations");
            }


            Annotation[] annotationsByType = c1.getAnnotationsByType(Documented.class);
            if (annotationsByType.length > 0) {
                for (Annotation annotation : annotationsByType) {
                    System.out.println("Annotation by Documented type: " + annotation);
                }
            } else {
                System.out.println("No @Documented annotations");
            }


            System.out.println("Canonical name: " + c1.getCanonicalName());

            Class<?>[] allPublicClassMembers = c1.getClasses();
            if (allPublicClassMembers.length > 0) {
                for (Class<?> cls : allPublicClassMembers) {
                    System.out.println("Public Class member: " + cls.getName());
                }
            } else {
                System.out.println("No public class members");
            }


            System.out.println("Class Loader: " + c1.getClassLoader());
            System.out.println("Component Type: " + c1.getComponentType());

            try {
                System.out.println("Constructor without args: " + c1.getConstructor());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            Constructor<?>[] allConstructors = c1.getConstructors();
            for (Constructor<?> constructor : allConstructors) {
                System.out.println("Constructor: " + constructor);
            }

            System.out.println("@Documented annotation declared on class: " + c1.getDeclaredAnnotation(Documented.class));
            Annotation[] declaredAnnotationsOnClass = c1.getDeclaredAnnotations();
            if (declaredAnnotationsOnClass.length > 0) {
                for (Annotation declaredAnnotation : declaredAnnotationsOnClass) {
                    System.out.println("Annotation declared on class: " + declaredAnnotation);
                }
            } else {
                System.out.println("No declared annotations on class");
            }

            Class<?>[] allClassMembers = c1.getDeclaredClasses();
            if (allClassMembers.length > 0) {
                for (Class<?> cls : allClassMembers) {
                    System.out.println("Class member: " + cls.getName());
                }
            } else {
                System.out.println("No class members");
            }

            try {
                System.out.println("Declared Constructor without args: " + c1.getDeclaredConstructor());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            Constructor<?>[] allDeclaredConstructors = c1.getDeclaredConstructors();
            for (Constructor<?> constructor : allDeclaredConstructors) {
                System.out.println("Declared constructor: " + constructor);
            }

            Field[] allDeclaredFields = c1.getDeclaredFields();
            if (allDeclaredFields.length > 0) {
                for (Field field : allDeclaredFields) {
                    try {
                        System.out.println("Declared field: " + c1.getDeclaredField(field.getName()));
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("No fields declared");
            }

            Method[] allDeclaredMethods = c1.getDeclaredMethods();
            if (allDeclaredMethods.length > 0) {
                for (Method method : allDeclaredMethods) {
                    if (method.getParameterCount() == 0) {
                        try {
                            System.out.println("Declared method: " + c1.getDeclaredMethod(method.getName()));
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Declared method: " + method);
                    }
                }

            } else {
                System.out.println("No methods declared");
            }

            System.out.println("This class is declared as a member in class: " + c1.getDeclaringClass());

            System.out.println("Immediate enclosing class of the underlying class: " + c1.getEnclosingClass());

            System.out.println("Immediate enclosing constructor of the underlying class: " + c1.getEnclosingConstructor());

            System.out.println("Immediate enclosing method of the underlying class: " + c1.getEnclosingMethod());

            if (args[0].contains("java")) {
                String[] en = (String[]) c1.getEnumConstants();
                if (en == null) {
                    System.out.println("No enum");
                } else {
                    for (String constant : en) {
                        System.out.println("Constant: " + constant);
                    }
                }
            } else {
                TestClass[] en = (TestClass[]) c1.getEnumConstants();
                if (en == null) {
                    System.out.println("No enum");

                } else {
                    for (TestClass constant : en) {
                        System.out.println("Constant: " + constant);
                    }
                }
            }

            Field[] allFields = c1.getFields();
            if (allFields.length > 0) {
                for (Field field : allFields) {
                    try {
                        System.out.println("Field: " + c1.getField(field.getName()));
                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("No accessible fields");
            }


            Type[] genericInterfaces = c1.getGenericInterfaces();
            if (genericInterfaces.length > 0) {
                for (Type genericInterface : genericInterfaces) {
                    System.out.println("Generic Interface: " + genericInterface.getTypeName());
                }
            } else {
                System.out.println("No generic interfaces");
            }

            System.out.println("Generic Superclass: " + c1.getGenericSuperclass());

            Class<?>[] interfaces = c1.getInterfaces();
            if(interfaces.length > 0) {
                for (Class<?> interf: interfaces) {
                    System.out.println("Interface: " + interf.getName());
                }
            } else {
                System.out.println("No interfaces");
            }

            Method[] allMethods = c1.getMethods();
            if (allMethods.length > 0) {
                for (Method method : allMethods) {
                    if (method.getParameterCount() == 0) {
                        try {
                            System.out.println("Method: " + c1.getMethod(method.getName()));
                        } catch (NoSuchMethodException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Method: " + method);
                    }
                }

            } else {
                System.out.println("No methods");
            }

            System.out.println("Modifiers encoded in an integer: " + c1.getModifiers());
            System.out.println("Name: " + c1.getName());
            System.out.println("Package: " + c1.getPackage());
            System.out.println("Protection Domain: " + c1.getProtectionDomain());
            System.out.println("Resource URL: " + c1.getResource("resource"));
            System.out.println("Resource as Stream: " + c1.getResourceAsStream("resource"));

            Object[] signers = c1.getSigners();
            if(signers != null) {
                for (Object signer: signers) {
                    System.out.println("Signer: " + signer);
                }
            } else {
                System.out.println("No signers");
            }

            System.out.println("Simple name: " + c1.getSimpleName());
            System.out.println("Super class: " + c1.getSuperclass());
            System.out.println("Type name: " + c1.getTypeName());

            TypeVariable<? extends Class<?>>[] typeParameters = c1.getTypeParameters();
            if(typeParameters.length > 0) {
                for (TypeVariable typeParameter: typeParameters) {
                    System.out.println("Type parameter: " + typeParameter);
                }
            } else {
                System.out.println("No type parameters");
            }

            System.out.println("Is this class object represents an annotation type: " + c1.isAnnotation());
            System.out.println("Is @Documented annotation present on this Class: " + c1.isAnnotationPresent(Documented.class));
            System.out.println("Is this class an anonymous one: " + c1.isAnonymousClass());
            System.out.println("Is this class an array: " + c1.isArray());
            System.out.println("Is this class assignable for type Object: " + c1.isAssignableFrom(Object.class));
            System.out.println("Is this class an enum: " + c1.isEnum());
            System.out.println("Does the parameter Object could be an instance for this class: " + c1.isInstance(new Object()));
            System.out.println("Is this class actually an interface: " + c1.isInterface());
            System.out.println("Is this class a local one: " + c1.isLocalClass());
            System.out.println("Is this class a member for another class: " + c1.isMemberClass());
            System.out.println("Is this class a primitive one: " + c1.isPrimitive());
            System.out.println("Is this class a synthetic one: " + c1.isSynthetic());
            if(args[0].contains("java")) {
                try {
                    String string = (String) c1.newInstance();
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    TestClass testClass = (TestClass) c1.newInstance();
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Generic String of this class: " + c1.toGenericString());
            System.out.println("String representation of this class: " + c1.toString());

        }
    }
}