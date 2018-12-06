SpringBeanLifeCycles: Java Maven Project with an added Spring Nature

This basically explains 3 different ways to handle the beans life cycle mehtods.
1) 	via InitializingBean and DisposbleBean callback interfaces
2) 	via BeanNameAware, BeanFactoryAware, ApplicationContextAware callback interfaces
3) 	The most recommended way to handle Spring Bean's Life cycle methods. Allows & imposes loose coupling via the use of init-method & destroy-method

