package	TokenNamepackage
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
optional	TokenNameIdentifier
.	TokenNameDOT
depend	TokenNameIdentifier
.	TokenNameDOT
constantpool	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FieldRefCPInfo	TokenNameIdentifier
extends	TokenNameextends
ConstantPoolEntry	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
String	TokenNameIdentifier
fieldClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
fieldName	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
fieldType	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
classIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
nameAndTypeIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FieldRefCPInfo	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
CONSTANT_FIELDREF	TokenNameIdentifier
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
read	TokenNameIdentifier
(	TokenNameLPAREN
DataInputStream	TokenNameIdentifier
cpStream	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
classIndex	TokenNameIdentifier
=	TokenNameEQUAL
cpStream	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nameAndTypeIndex	TokenNameIdentifier
=	TokenNameEQUAL
cpStream	TokenNameIdentifier
.	TokenNameDOT
readUnsignedShort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
resolve	TokenNameIdentifier
(	TokenNameLPAREN
ConstantPool	TokenNameIdentifier
constantPool	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassCPInfo	TokenNameIdentifier
fieldClass	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
ClassCPInfo	TokenNameIdentifier
)	TokenNameRPAREN
constantPool	TokenNameIdentifier
.	TokenNameDOT
getEntry	TokenNameIdentifier
(	TokenNameLPAREN
classIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fieldClass	TokenNameIdentifier
.	TokenNameDOT
resolve	TokenNameIdentifier
(	TokenNameLPAREN
constantPool	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fieldClassName	TokenNameIdentifier
=	TokenNameEQUAL
fieldClass	TokenNameIdentifier
.	TokenNameDOT
getClassName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
NameAndTypeCPInfo	TokenNameIdentifier
nt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
NameAndTypeCPInfo	TokenNameIdentifier
)	TokenNameRPAREN
constantPool	TokenNameIdentifier
.	TokenNameDOT
getEntry	TokenNameIdentifier
(	TokenNameLPAREN
nameAndTypeIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
nt	TokenNameIdentifier
.	TokenNameDOT
resolve	TokenNameIdentifier
(	TokenNameLPAREN
constantPool	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fieldName	TokenNameIdentifier
=	TokenNameEQUAL
nt	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fieldType	TokenNameIdentifier
=	TokenNameEQUAL
nt	TokenNameIdentifier
.	TokenNameDOT
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
super	TokenNamesuper
.	TokenNameDOT
resolve	TokenNameIdentifier
(	TokenNameLPAREN
constantPool	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
value	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isResolved	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
value	TokenNameIdentifier
=	TokenNameEQUAL
"Field : Class = "	TokenNameStringLiteral
+	TokenNamePLUS
fieldClassName	TokenNameIdentifier
+	TokenNamePLUS
", name = "	TokenNameStringLiteral
+	TokenNamePLUS
fieldName	TokenNameIdentifier
+	TokenNamePLUS
", type = "	TokenNameStringLiteral
+	TokenNamePLUS
fieldType	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
value	TokenNameIdentifier
=	TokenNameEQUAL
"Field : Class index = "	TokenNameStringLiteral
+	TokenNamePLUS
classIndex	TokenNameIdentifier
+	TokenNamePLUS
", name and type index = "	TokenNameStringLiteral
+	TokenNamePLUS
nameAndTypeIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getFieldClassName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fieldClassName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getFieldName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fieldName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getFieldType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
fieldType	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
