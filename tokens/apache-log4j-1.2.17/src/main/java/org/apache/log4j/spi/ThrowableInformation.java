package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
Category	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
DefaultThrowableRenderer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ThrowableInformation	TokenNameIdentifier
implements	TokenNameimplements
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
4748765566864322735L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
transient	TokenNametransient
Throwable	TokenNameIdentifier
throwable	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
transient	TokenNametransient
Category	TokenNameIdentifier
category	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
rep	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ThrowableInformation	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
throwable	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
throwable	TokenNameIdentifier
=	TokenNameEQUAL
throwable	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ThrowableInformation	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
throwable	TokenNameIdentifier
,	TokenNameCOMMA
Category	TokenNameIdentifier
category	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
throwable	TokenNameIdentifier
=	TokenNameEQUAL
throwable	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
category	TokenNameIdentifier
=	TokenNameEQUAL
category	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ThrowableInformation	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
r	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
rep	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
r	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Throwable	TokenNameIdentifier
getThrowable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
throwable	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getThrowableStrRep	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
rep	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
ThrowableRenderer	TokenNameIdentifier
renderer	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
category	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
LoggerRepository	TokenNameIdentifier
repo	TokenNameIdentifier
=	TokenNameEQUAL
category	TokenNameIdentifier
.	TokenNameDOT
getLoggerRepository	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
repo	TokenNameIdentifier
instanceof	TokenNameinstanceof
ThrowableRendererSupport	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
renderer	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
ThrowableRendererSupport	TokenNameIdentifier
)	TokenNameRPAREN
repo	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getThrowableRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
renderer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
rep	TokenNameIdentifier
=	TokenNameEQUAL
DefaultThrowableRenderer	TokenNameIdentifier
.	TokenNameDOT
render	TokenNameIdentifier
(	TokenNameLPAREN
throwable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
rep	TokenNameIdentifier
=	TokenNameEQUAL
renderer	TokenNameIdentifier
.	TokenNameDOT
doRender	TokenNameIdentifier
(	TokenNameLPAREN
throwable	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
rep	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE