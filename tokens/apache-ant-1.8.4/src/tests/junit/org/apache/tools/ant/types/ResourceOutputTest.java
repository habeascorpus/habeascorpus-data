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
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
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
net	TokenNameIdentifier
.	TokenNameDOT
UnknownServiceException	TokenNameIdentifier
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
BuildFileTest	TokenNameIdentifier
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
taskdefs	TokenNameIdentifier
.	TokenNameDOT
Zip	TokenNameIdentifier
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
ImmutableResourceException	TokenNameIdentifier
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
PropertyResource	TokenNameIdentifier
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
StringResource	TokenNameIdentifier
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
URLResource	TokenNameIdentifier
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
ZipResource	TokenNameIdentifier
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
ResourceUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ResourceOutputTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
FileUtils	TokenNameIdentifier
FILE_UTILS	TokenNameIdentifier
=	TokenNameEQUAL
FileUtils	TokenNameIdentifier
.	TokenNameDOT
getFileUtils	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
File	TokenNameIdentifier
basedir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"root"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"src/etc/testcases/types/resources"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
ResourceOutputTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
project	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Project	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
project	TokenNameIdentifier
.	TokenNameDOT
setUserProperty	TokenNameIdentifier
(	TokenNameLPAREN
"basedir"	TokenNameStringLiteral
,	TokenNameCOMMA
basedir	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testresourceoutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
testoutputbe	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Resource	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"should have caught UnsupportedOperationException"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
UnsupportedOperationException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
teststringoutput1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringResource	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringResource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testoutputbe	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
teststringoutput2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StringResource	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringResource	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
testoutput	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"should have caught ImmutableResourceException"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ImmutableResourceException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fail	TokenNameIdentifier
(	TokenNameLPAREN
"caught some other IOException: "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
r	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testpropertyoutput1	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
PropertyResource	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PropertyResource	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testoutputbe	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyEquals	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testpropertyoutput2	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setNewProperty	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
"bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PropertyResource	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PropertyResource	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
testoutput	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"should have caught ImmutableResourceException"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ImmutableResourceException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fail	TokenNameIdentifier
(	TokenNameLPAREN
"caught some other IOException: "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
assertPropertyEquals	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
"bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testurloutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
"testurloutput"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
FILE_UTILS	TokenNameIdentifier
.	TokenNameDOT
createNewFile	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testoutput	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
URLResource	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"should have caught UnknownServiceException"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
UnknownServiceException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"caught some other IOException: "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
f	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
f	TokenNameIdentifier
.	TokenNameDOT
deleteOnExit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testzipentryoutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Zip	TokenNameIdentifier
z	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Zip	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
z	TokenNameIdentifier
.	TokenNameDOT
setProject	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Zip	TokenNameIdentifier
.	TokenNameDOT
WhenEmpty	TokenNameIdentifier
create	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Zip	TokenNameIdentifier
.	TokenNameDOT
WhenEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
create	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"create"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
z	TokenNameIdentifier
.	TokenNameDOT
setWhenempty	TokenNameIdentifier
(	TokenNameLPAREN
create	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
z	TokenNameIdentifier
.	TokenNameDOT
setBasedir	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
z	TokenNameIdentifier
.	TokenNameDOT
setExcludes	TokenNameIdentifier
(	TokenNameLPAREN
"**/*"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
resolveFile	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
z	TokenNameIdentifier
.	TokenNameDOT
setDestFile	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
z	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ZipResource	TokenNameIdentifier
r	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ZipResource	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
setZipfile	TokenNameIdentifier
(	TokenNameLPAREN
f	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
r	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
testoutputbe	TokenNameIdentifier
(	TokenNameLPAREN
r	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"should have caught UnsupportedOperationException"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
UnsupportedOperationException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
f	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
f	TokenNameIdentifier
.	TokenNameDOT
deleteOnExit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
testoutputbe	TokenNameIdentifier
(	TokenNameLPAREN
Resource	TokenNameIdentifier
dest	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
testoutput	TokenNameIdentifier
(	TokenNameLPAREN
dest	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
testoutput	TokenNameIdentifier
(	TokenNameLPAREN
Resource	TokenNameIdentifier
dest	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
ResourceUtils	TokenNameIdentifier
.	TokenNameDOT
copyResource	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StringResource	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
dest	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
