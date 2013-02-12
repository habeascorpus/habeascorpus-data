package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
resources	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Stack	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Project	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
Resource	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
ResourceCollection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
resources	TokenNameIdentifier
.	TokenNameDOT
selectors	TokenNameIdentifier
.	TokenNameDOT
ResourceSelector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
resources	TokenNameIdentifier
.	TokenNameDOT
selectors	TokenNameIdentifier
.	TokenNameDOT
ResourceSelectorContainer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Restrict	TokenNameIdentifier
extends	TokenNameextends
ResourceSelectorContainer	TokenNameIdentifier
implements	TokenNameimplements
ResourceCollection	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
LazyResourceCollectionWrapper	TokenNameIdentifier
w	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LazyResourceCollectionWrapper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
filterResource	TokenNameIdentifier
(	TokenNameLPAREN
Resource	TokenNameIdentifier
r	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
i	TokenNameIdentifier
=	TokenNameEQUAL
getSelectors	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
(	TokenNameLPAREN
(	TokenNameLPAREN
ResourceSelector	TokenNameIdentifier
)	TokenNameRPAREN
(	TokenNameLPAREN
i	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
ResourceCollection	TokenNameIdentifier
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
noChildrenAllowed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
c	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
w	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setChecked	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
setCache	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
b	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
w	TokenNameIdentifier
.	TokenNameDOT
setCache	TokenNameIdentifier
(	TokenNameLPAREN
b	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
boolean	TokenNameboolean
isCache	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
w	TokenNameIdentifier
.	TokenNameDOT
isCache	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
ResourceSelector	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
super	TokenNamesuper
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
FailFast	TokenNameIdentifier
.	TokenNameDOT
invalidate	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
synchronized	TokenNamesynchronized
Iterator	TokenNameIdentifier
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
Restrict	TokenNameIdentifier
)	TokenNameRPAREN
getCheckedRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
dieOnCircularReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
w	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
int	TokenNameint
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
Restrict	TokenNameIdentifier
)	TokenNameRPAREN
getCheckedRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
dieOnCircularReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
w	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
boolean	TokenNameboolean
isFilesystemOnly	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
Restrict	TokenNameIdentifier
)	TokenNameRPAREN
getCheckedRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isFilesystemOnly	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
dieOnCircularReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
w	TokenNameIdentifier
.	TokenNameDOT
isFilesystemOnly	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getCheckedRef	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
dieOnCircularReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
w	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
synchronized	TokenNamesynchronized
void	TokenNamevoid
dieOnCircularReference	TokenNameIdentifier
(	TokenNameLPAREN
Stack	TokenNameIdentifier
stk	TokenNameIdentifier
,	TokenNameCOMMA
Project	TokenNameIdentifier
p	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isChecked	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
super	TokenNamesuper
.	TokenNameDOT
dieOnCircularReference	TokenNameIdentifier
(	TokenNameLPAREN
stk	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
pushAndInvokeCircularReferenceCheck	TokenNameIdentifier
(	TokenNameLPAREN
w	TokenNameIdentifier
,	TokenNameCOMMA
stk	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setChecked	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE