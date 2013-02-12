package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
or	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
.	TokenNameDOT
RendererSupport	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
LogLog	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
Loader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
OptionConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
RendererMap	TokenNameIdentifier
{	TokenNameLBRACE
Hashtable	TokenNameIdentifier
map	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
ObjectRenderer	TokenNameIdentifier
defaultRenderer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
RendererMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
map	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
public	TokenNamepublic
void	TokenNamevoid
addRenderer	TokenNameIdentifier
(	TokenNameLPAREN
RendererSupport	TokenNameIdentifier
repository	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
renderedClassName	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
renderingClassName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Rendering class: ["	TokenNameStringLiteral
+	TokenNamePLUS
renderingClassName	TokenNameIdentifier
+	TokenNamePLUS
"], Rendered class: ["	TokenNameStringLiteral
+	TokenNamePLUS
renderedClassName	TokenNameIdentifier
+	TokenNamePLUS
"]."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ObjectRenderer	TokenNameIdentifier
renderer	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ObjectRenderer	TokenNameIdentifier
)	TokenNameRPAREN
OptionConverter	TokenNameIdentifier
.	TokenNameDOT
instantiateByClassName	TokenNameIdentifier
(	TokenNameLPAREN
renderingClassName	TokenNameIdentifier
,	TokenNameCOMMA
ObjectRenderer	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
renderer	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Could not instantiate renderer ["	TokenNameStringLiteral
+	TokenNamePLUS
renderingClassName	TokenNameIdentifier
+	TokenNamePLUS
"]."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Class	TokenNameIdentifier
renderedClass	TokenNameIdentifier
=	TokenNameEQUAL
Loader	TokenNameIdentifier
.	TokenNameDOT
loadClass	TokenNameIdentifier
(	TokenNameLPAREN
renderedClassName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
repository	TokenNameIdentifier
.	TokenNameDOT
setRenderer	TokenNameIdentifier
(	TokenNameLPAREN
renderedClass	TokenNameIdentifier
,	TokenNameCOMMA
renderer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ClassNotFoundException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Could not find class ["	TokenNameStringLiteral
+	TokenNamePLUS
renderedClassName	TokenNameIdentifier
+	TokenNamePLUS
"]."	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
findAndRender	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
get	TokenNameIdentifier
(	TokenNameLPAREN
o	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
doRender	TokenNameIdentifier
(	TokenNameLPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ObjectRenderer	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
get	TokenNameIdentifier
(	TokenNameLPAREN
o	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ObjectRenderer	TokenNameIdentifier
get	TokenNameIdentifier
(	TokenNameLPAREN
Class	TokenNameIdentifier
clazz	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ObjectRenderer	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Class	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
clazz	TokenNameIdentifier
;	TokenNameSEMICOLON
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
c	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
getSuperclass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
r	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ObjectRenderer	TokenNameIdentifier
)	TokenNameRPAREN
map	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
r	TokenNameIdentifier
=	TokenNameEQUAL
searchInterfaces	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
defaultRenderer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ObjectRenderer	TokenNameIdentifier
searchInterfaces	TokenNameIdentifier
(	TokenNameLPAREN
Class	TokenNameIdentifier
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ObjectRenderer	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ObjectRenderer	TokenNameIdentifier
)	TokenNameRPAREN
map	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
Class	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ia	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
getInterfaces	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
ia	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
r	TokenNameIdentifier
=	TokenNameEQUAL
searchInterfaces	TokenNameIdentifier
(	TokenNameLPAREN
ia	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
r	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
r	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ObjectRenderer	TokenNameIdentifier
getDefaultRenderer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
defaultRenderer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
map	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
put	TokenNameIdentifier
(	TokenNameLPAREN
Class	TokenNameIdentifier
clazz	TokenNameIdentifier
,	TokenNameCOMMA
ObjectRenderer	TokenNameIdentifier
or	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
map	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
clazz	TokenNameIdentifier
,	TokenNameCOMMA
or	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
