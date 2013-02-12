package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
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
InetAddress	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
security	TokenNameIdentifier
.	TokenNameDOT
MessageDigest	TokenNameIdentifier
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
Collection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
CFMetaData	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
DataOutputBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
Allocator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
ByteBufferUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
HeapAllocator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Column	TokenNameIdentifier
implements	TokenNameimplements
IColumn	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
ColumnSerializer	TokenNameIdentifier
serializer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ColumnSerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
OnDiskAtom	TokenNameIdentifier
.	TokenNameDOT
Serializer	TokenNameIdentifier
onDiskSerializer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OnDiskAtom	TokenNameIdentifier
.	TokenNameDOT
Serializer	TokenNameIdentifier
(	TokenNameLPAREN
serializer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
ColumnSerializer	TokenNameIdentifier
serializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
serializer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
OnDiskAtom	TokenNameIdentifier
.	TokenNameDOT
Serializer	TokenNameIdentifier
onDiskSerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
onDiskSerializer	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
final	TokenNamefinal
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
ByteBuffer	TokenNameIdentifier
value	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
long	TokenNamelong
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
Column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
EMPTY_BYTE_BUFFER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Column	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
name	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
assert	TokenNameassert
name	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
IColumn	TokenNameIdentifier
.	TokenNameDOT
MAX_NAME_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
name	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
timestamp	TokenNameIdentifier
=	TokenNameEQUAL
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Column	TokenNameIdentifier
getSubColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
columnName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
"This operation is unsupported on simple columns."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ByteBuffer	TokenNameIdentifier
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Collection	TokenNameIdentifier
<	TokenNameLESS
IColumn	TokenNameIdentifier
>	TokenNameGREATER
getSubColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
"This operation is unsupported on simple columns."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
maxTimestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
1000	TokenNameIntegerLiteral
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
getLocalDeletionTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
getMarkedForDeleteAt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"column is not marked for delete"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
mostRecentLiveChangeAt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
mostRecentNonGCableChangeAt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
gcbefore	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
dataSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
value	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
TypeSizes	TokenNameIdentifier
typeSizes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
nameSize	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
valueSize	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
typeSizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
short	TokenNameshort
)	TokenNameRPAREN
nameSize	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
nameSize	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
+	TokenNamePLUS
typeSizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
typeSizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
valueSize	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
valueSize	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
serializedSizeForSSTable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
TypeSizes	TokenNameIdentifier
.	TokenNameDOT
NATIVE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
serializationFlags	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addColumn	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
,	TokenNameCOMMA
Allocator	TokenNameIdentifier
allocator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
"This operation is not supported for simple columns."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IColumn	TokenNameIdentifier
diff	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
column	TokenNameIdentifier
.	TokenNameDOT
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
column	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
updateDigest	TokenNameIdentifier
(	TokenNameLPAREN
MessageDigest	TokenNameIdentifier
digest	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
digest	TokenNameIdentifier
.	TokenNameDOT
update	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
.	TokenNameDOT
duplicate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
digest	TokenNameIdentifier
.	TokenNameDOT
update	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
duplicate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DataOutputBuffer	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DataOutputBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
buffer	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
serializationFlags	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
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
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
digest	TokenNameIdentifier
.	TokenNameDOT
update	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
.	TokenNameDOT
getData	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
buffer	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getLocalDeletionTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Integer	TokenNameIdentifier
.	TokenNameDOT
MAX_VALUE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IColumn	TokenNameIdentifier
reconcile	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
reconcile	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
,	TokenNameCOMMA
HeapAllocator	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IColumn	TokenNameIdentifier
reconcile	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
,	TokenNameCOMMA
Allocator	TokenNameIdentifier
allocator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
column	TokenNameIdentifier
.	TokenNameDOT
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
column	TokenNameIdentifier
:	TokenNameCOLON
this	TokenNamethis
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
column	TokenNameIdentifier
.	TokenNameDOT
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
this	TokenNamethis
:	TokenNameCOLON
column	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
column	TokenNameIdentifier
.	TokenNameDOT
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
compareTo	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
?	TokenNameQUESTION
column	TokenNameIdentifier
:	TokenNameCOLON
this	TokenNamethis
;	TokenNameSEMICOLON
return	TokenNamereturn
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
column	TokenNameIdentifier
.	TokenNameDOT
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
?	TokenNameQUESTION
column	TokenNameIdentifier
:	TokenNameCOLON
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
==	TokenNameEQUAL_EQUAL
o	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
o	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
Column	TokenNameIdentifier
column	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Column	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
column	TokenNameIdentifier
.	TokenNameDOT
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
name	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
return	TokenNamereturn
value	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
result	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
name	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
31	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
result	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
value	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
?	TokenNameQUESTION
value	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
:	TokenNameCOLON
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
31	TokenNameIntegerLiteral
*	TokenNameMULTIPLY
result	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
^	TokenNameXOR
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
>>>	TokenNameUNSIGNED_RIGHT_SHIFT
32	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IColumn	TokenNameIdentifier
localCopy	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
localCopy	TokenNameIdentifier
(	TokenNameLPAREN
cfs	TokenNameIdentifier
,	TokenNameCOMMA
HeapAllocator	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IColumn	TokenNameIdentifier
localCopy	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
,	TokenNameCOMMA
Allocator	TokenNameIdentifier
allocator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
cfs	TokenNameIdentifier
.	TokenNameDOT
internOrCopy	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
allocator	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
allocator	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getString	TokenNameIdentifier
(	TokenNameLPAREN
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
comparator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
comparator	TokenNameIdentifier
.	TokenNameDOT
getString	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
":"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
":"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"@"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
timestamp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isLive	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
!	TokenNameNOT
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
validateName	TokenNameIdentifier
(	TokenNameLPAREN
CFMetaData	TokenNameIdentifier
metadata	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MarshalException	TokenNameIdentifier
{	TokenNameLBRACE
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
nameValidator	TokenNameIdentifier
=	TokenNameEQUAL
metadata	TokenNameIdentifier
.	TokenNameDOT
cfType	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
ColumnFamilyType	TokenNameIdentifier
.	TokenNameDOT
Super	TokenNameIdentifier
?	TokenNameQUESTION
metadata	TokenNameIdentifier
.	TokenNameDOT
subcolumnComparator	TokenNameIdentifier
:	TokenNameCOLON
metadata	TokenNameIdentifier
.	TokenNameDOT
comparator	TokenNameIdentifier
;	TokenNameSEMICOLON
nameValidator	TokenNameIdentifier
.	TokenNameDOT
validate	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
validateFields	TokenNameIdentifier
(	TokenNameLPAREN
CFMetaData	TokenNameIdentifier
metadata	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MarshalException	TokenNameIdentifier
{	TokenNameLBRACE
validateName	TokenNameIdentifier
(	TokenNameLPAREN
metadata	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>	TokenNameGREATER
valueValidator	TokenNameIdentifier
=	TokenNameEQUAL
metadata	TokenNameIdentifier
.	TokenNameDOT
getValueValidator	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
valueValidator	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
valueValidator	TokenNameIdentifier
.	TokenNameDOT
validate	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
hasIrrelevantData	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
gcBefore	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getLocalDeletionTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
gcBefore	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Column	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
names	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
decomposeName	TokenNameIdentifier
(	TokenNameLPAREN
names	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
UTF8Type	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Column	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
value	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
names	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
decomposeName	TokenNameIdentifier
(	TokenNameLPAREN
names	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
Int32Type	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Column	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
value	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
names	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
decomposeName	TokenNameIdentifier
(	TokenNameLPAREN
names	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
BooleanType	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Column	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
double	TokenNamedouble
value	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
names	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
decomposeName	TokenNameIdentifier
(	TokenNameLPAREN
names	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
DoubleType	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Column	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
names	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
decomposeName	TokenNameIdentifier
(	TokenNameLPAREN
names	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Column	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
InetAddress	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
names	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
Column	TokenNameIdentifier
(	TokenNameLPAREN
decomposeName	TokenNameIdentifier
(	TokenNameLPAREN
names	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
InetAddressType	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
ByteBuffer	TokenNameIdentifier
decomposeName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
...	TokenNameELLIPSIS
names	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assert	TokenNameassert
names	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
names	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
UTF8Type	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
names	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>>	TokenNameRIGHT_SHIFT
types	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
<	TokenNameLESS
AbstractType	TokenNameIdentifier
<	TokenNameLESS
?	TokenNameQUESTION
>>	TokenNameRIGHT_SHIFT
(	TokenNameLPAREN
names	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
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
names	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
types	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
UTF8Type	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CompositeType	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
builder	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CompositeType	TokenNameIdentifier
.	TokenNameDOT
Builder	TokenNameIdentifier
(	TokenNameLPAREN
CompositeType	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
types	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
:	TokenNameCOLON
names	TokenNameIdentifier
)	TokenNameRPAREN
builder	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
UTF8Type	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
builder	TokenNameIdentifier
.	TokenNameDOT
build	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE