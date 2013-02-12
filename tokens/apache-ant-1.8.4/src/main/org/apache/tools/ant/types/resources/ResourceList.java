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
io	TokenNameIdentifier
.	TokenNameDOT
BufferedInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
BufferedReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStreamReader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
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
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
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
BuildException	TokenNameIdentifier
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
PropertyHelper	TokenNameIdentifier
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
filters	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ChainReaderHelper	TokenNameIdentifier
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
DataType	TokenNameIdentifier
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
FilterChain	TokenNameIdentifier
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
Reference	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
FileUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ResourceList	TokenNameIdentifier
extends	TokenNameextends
DataType	TokenNameIdentifier
implements	TokenNameimplements
ResourceCollection	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
final	TokenNamefinal
Vector	TokenNameIdentifier
filterChains	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
ArrayList	TokenNameIdentifier
textDocuments	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Union	TokenNameIdentifier
cachedResources	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Union	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
volatile	TokenNamevolatile
boolean	TokenNameboolean
cached	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
encoding	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
ResourceList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
cachedResources	TokenNameIdentifier
.	TokenNameDOT
setCache	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
add	TokenNameIdentifier
(	TokenNameLPAREN
ResourceCollection	TokenNameIdentifier
rc	TokenNameIdentifier
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
textDocuments	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
rc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setChecked	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
addFilterChain	TokenNameIdentifier
(	TokenNameLPAREN
FilterChain	TokenNameIdentifier
filter	TokenNameIdentifier
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
filterChains	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
filter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setChecked	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
void	TokenNamevoid
setEncoding	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
encoding	TokenNameIdentifier
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
tooManyAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
encoding	TokenNameIdentifier
=	TokenNameEQUAL
encoding	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setRefid	TokenNameIdentifier
(	TokenNameLPAREN
Reference	TokenNameIdentifier
r	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
encoding	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
tooManyAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
filterChains	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
||	TokenNameOR_OR
textDocuments	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
noChildrenAllowed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
super	TokenNamesuper
.	TokenNameDOT
setRefid	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
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
ResourceList	TokenNameIdentifier
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
return	TokenNamereturn
cache	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
ResourceList	TokenNameIdentifier
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
return	TokenNamereturn
cache	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
ResourceList	TokenNameIdentifier
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
return	TokenNamereturn
cache	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
isFilesystemOnly	TokenNameIdentifier
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
throws	TokenNamethrows
BuildException	TokenNameIdentifier
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
if	TokenNameif
(	TokenNameLPAREN
isReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
dieOnCircularReference	TokenNameIdentifier
(	TokenNameLPAREN
stk	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
textDocuments	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
o	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Object	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
instanceof	TokenNameinstanceof
DataType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
pushAndInvokeCircularReferenceCheck	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
DataType	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
,	TokenNameCOMMA
stk	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
filterChains	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
FilterChain	TokenNameIdentifier
fc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FilterChain	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
pushAndInvokeCircularReferenceCheck	TokenNameIdentifier
(	TokenNameLPAREN
fc	TokenNameIdentifier
,	TokenNameCOMMA
stk	TokenNameIdentifier
,	TokenNameCOMMA
p	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
setChecked	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
synchronized	TokenNamesynchronized
ResourceCollection	TokenNameIdentifier
cache	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
cached	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
dieOnCircularReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
textDocuments	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
ResourceCollection	TokenNameIdentifier
rc	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ResourceCollection	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
rc	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
cachedResources	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
read	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Resource	TokenNameIdentifier
)	TokenNameRPAREN
r	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
cached	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
cachedResources	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
ResourceCollection	TokenNameIdentifier
read	TokenNameIdentifier
(	TokenNameLPAREN
Resource	TokenNameIdentifier
r	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
BufferedInputStream	TokenNameIdentifier
bis	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
bis	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedInputStream	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
.	TokenNameDOT
getInputStream	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Reader	TokenNameIdentifier
input	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
encoding	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
input	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
bis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
input	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
InputStreamReader	TokenNameIdentifier
(	TokenNameLPAREN
bis	TokenNameIdentifier
,	TokenNameCOMMA
encoding	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
ChainReaderHelper	TokenNameIdentifier
crh	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ChainReaderHelper	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
crh	TokenNameIdentifier
.	TokenNameDOT
setPrimaryReader	TokenNameIdentifier
(	TokenNameLPAREN
input	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
crh	TokenNameIdentifier
.	TokenNameDOT
setFilterChains	TokenNameIdentifier
(	TokenNameLPAREN
filterChains	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
crh	TokenNameIdentifier
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BufferedReader	TokenNameIdentifier
reader	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BufferedReader	TokenNameIdentifier
(	TokenNameLPAREN
crh	TokenNameIdentifier
.	TokenNameDOT
getAssembledReader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Union	TokenNameIdentifier
streamResources	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Union	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
streamResources	TokenNameIdentifier
.	TokenNameDOT
setCache	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
line	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
line	TokenNameIdentifier
=	TokenNameEQUAL
reader	TokenNameIdentifier
.	TokenNameDOT
readLine	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
streamResources	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
parse	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
streamResources	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
final	TokenNamefinal
IOException	TokenNameIdentifier
ioe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"Unable to read resource "	TokenNameStringLiteral
+	TokenNamePLUS
r	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
": "	TokenNameStringLiteral
+	TokenNamePLUS
ioe	TokenNameIdentifier
,	TokenNameCOMMA
ioe	TokenNameIdentifier
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
FileUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
bis	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
Resource	TokenNameIdentifier
parse	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
line	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
PropertyHelper	TokenNameIdentifier
propertyHelper	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
PropertyHelper	TokenNameIdentifier
)	TokenNameRPAREN
PropertyHelper	TokenNameIdentifier
.	TokenNameDOT
getPropertyHelper	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
expanded	TokenNameIdentifier
=	TokenNameEQUAL
propertyHelper	TokenNameIdentifier
.	TokenNameDOT
parseProperties	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
expanded	TokenNameIdentifier
instanceof	TokenNameinstanceof
Resource	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Resource	TokenNameIdentifier
)	TokenNameRPAREN
expanded	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
String	TokenNameIdentifier
expandedLine	TokenNameIdentifier
=	TokenNameEQUAL
expanded	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
colon	TokenNameIdentifier
=	TokenNameEQUAL
expandedLine	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
":"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
colon	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
URLResource	TokenNameIdentifier
(	TokenNameLPAREN
expandedLine	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
mfe	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
FileResource	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
expandedLine	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
